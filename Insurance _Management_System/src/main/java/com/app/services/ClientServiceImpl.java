package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DTO.LoginResponseDTO;
import com.app.DTO.UserLoginDTO;
import com.app.DTO.UserRegisterDTO;
import com.app.daos.ClientDao;
import com.app.entities.Client;

import com.app.entities.user.User;

import io.swagger.v3.core.util.Json;

@Transactional
@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDoa;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private LoginResponseDTO loginResponseDTO;

	private String token = "x";

	@Override
	public List<Client> getAllUser() {
		return clientDoa.findAll();
	}

	@Override
	public LoginResponseDTO loginUser(UserLoginDTO userLoginDTO) {
		Client client = clientDoa.findByEmailAndPassword(userLoginDTO.getEmail(), userLoginDTO.getPassword());
//		System.err.println(client);

		int clientId = 0;
		boolean flag = false;
		if (client != null) {
			clientId = client.getId();
			flag = true;
		}

		loginResponseDTO.setClientId(clientId);
		loginResponseDTO.setLoginSuccess(flag);
		loginResponseDTO.setToken(token);
		return loginResponseDTO;
	}

	@Override
	public boolean registerUser(UserRegisterDTO userRegisterDTO) {
		if (clientDoa.findByEmail(userRegisterDTO.getEmail()) == null) {
			Client client = mapper.map(userRegisterDTO, Client.class);
			clientDoa.save(client);
			return true;
		} else
			return false;
	}

}
