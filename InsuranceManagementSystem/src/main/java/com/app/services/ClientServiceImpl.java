package com.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DTO.LoginResponseDTO;
import com.app.DTO.PersonalDetailsDTO;
import com.app.DTO.UserLoginDTO;
import com.app.DTO.UserRegisterDTO;
import com.app.daos.ClientDao;
import com.app.entities.Client;
import com.app.entities.Gender;
import com.app.entities.MaritalStatus;

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
	public List<PersonalDetailsDTO> getAllUser() {
		List<PersonalDetailsDTO> clients = new ArrayList<>();
		for(Client client : clientDoa.findAll()) {
			PersonalDetailsDTO CDTO = mapper.map(client, PersonalDetailsDTO.class);
			clients.add(CDTO);
		}
		return clients;
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

	@Override
	public PersonalDetailsDTO editPersonalDetailsUser
							(PersonalDetailsDTO personalDetailsDTO, int id) {
		Client client = clientDoa.findById(id).get();
		mapper.map(personalDetailsDTO, client);
		for(Gender g : Gender.values()) {
			if(personalDetailsDTO.getGender().equals(g))
				client.setGender(g);
		}
		
		for(MaritalStatus m : MaritalStatus.values()) {
			if(personalDetailsDTO.getMaritalStatus().equals(m))
				client.setMaritalStatus(m);
		}
		
		return personalDetailsDTO;
	}

}
