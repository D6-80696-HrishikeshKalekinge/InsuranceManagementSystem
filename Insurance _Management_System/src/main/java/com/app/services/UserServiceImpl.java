package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.UserDao;
import com.app.entities.DTO.UserLoginDTO;
import com.app.entities.DTO.UserRegisterDTO;
import com.app.entities.users.User;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDoa;
	
	@Autowired
	private ModelMapper mapper;
	
	private String token = "x";

	@Override
	public List<User> getAllUser() {
		return userDoa.findAll();
	}

	@Override
	public String loginUser(UserLoginDTO userLoginDTO) {
		User user = userDoa.findByEmailAndPassword(userLoginDTO.getEmail(), userLoginDTO.getPassword());
		System.err.println(user);
		
		return user != null ? "token : " + token : "registration failed!";
	}

	@Override
	public boolean registerUser(UserRegisterDTO userRegisterDTO) {
		if(userDoa.findByEmail(userRegisterDTO.getEmail()) == null){
			User user = mapper.map(userRegisterDTO, User.class);
			userDoa.save(user);
			return true;
		}
		else return false;
	}
}
