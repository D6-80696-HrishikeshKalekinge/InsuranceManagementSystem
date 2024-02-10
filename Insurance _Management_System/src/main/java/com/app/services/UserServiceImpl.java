package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.PolicyDao;
import com.app.daos.UserDao;
import com.app.entities.DTO.UserLoginDTO;
import com.app.entities.DTO.UserRegisterDTO;
import com.app.entities.clients.Client;
import com.app.entities.policies.Policy;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDoa;
	
	@Autowired
	private PolicyDao policyDao;
	
	@Autowired
	private ModelMapper mapper;
	
	private String token = "x";

	@Override
	public List<Client> getAllUser() {
		return userDoa.findAll();
	}

	@Override
	public String loginUser(UserLoginDTO userLoginDTO) {
		Client client = userDoa.findByEmailAndPassword(userLoginDTO.getEmail(), userLoginDTO.getPassword());
		System.err.println(client);
		
		return client != null ? "token : " + token : "registration failed!";
	}

	@Override
	public boolean registerUser(UserRegisterDTO userRegisterDTO) {
		if(userDoa.findByEmail(userRegisterDTO.getEmail()) == null){
			Client client = mapper.map(userRegisterDTO, Client.class);
			userDoa.save(client);
			return true;
		}
		else return false;
	}

	
}
