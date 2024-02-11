package com.app.services;

import java.util.List;
import java.util.Optional;

import com.app.DTO.LoginResponseDTO;
import com.app.DTO.UserLoginDTO;
import com.app.DTO.UserRegisterDTO;
import com.app.entities.Client;
import com.app.entities.user.User;

public interface ClientService {

	List<Client> getAllUser();

	LoginResponseDTO loginUser(UserLoginDTO userLoginDTO);

	boolean registerUser(UserRegisterDTO userRegisterDTO);

}
