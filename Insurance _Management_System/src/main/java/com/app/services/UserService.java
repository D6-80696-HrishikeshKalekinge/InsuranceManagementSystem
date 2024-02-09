package com.app.services;

import java.util.List;

import com.app.entities.DTO.UserLoginDTO;
import com.app.entities.DTO.UserRegisterDTO;
import com.app.entities.clients.Client;

public interface UserService {

	List<Client> getAllUser();

	String loginUser(UserLoginDTO userLoginDTO);

	boolean registerUser(UserRegisterDTO userRegisterDTO);


}
