package com.app.services;

import java.util.List;

import com.app.entities.DTO.UserLoginDTO;
import com.app.entities.DTO.UserRegisterDTO;
import com.app.entities.users.User;

public interface UserService {

	List<User> getAllUser();

	String loginUser(UserLoginDTO userLoginDTO);

	boolean registerUser(UserRegisterDTO userRegisterDTO);


}
