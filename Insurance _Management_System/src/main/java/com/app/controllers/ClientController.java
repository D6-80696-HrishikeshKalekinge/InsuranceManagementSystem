package com.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTO.UserLoginDTO;
import com.app.DTO.UserRegisterDTO;
import com.app.services.ClientService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@Validated
public class ClientController {

	@Autowired
	private ClientService clientService;

	// Testing purpose
	@GetMapping("/user")
	public ResponseEntity<?> getAllUser() {
		return ResponseEntity.status(HttpStatus.OK).body(clientService.getAllUser());
	}
	
	/*
	 * http://localhost:3000/login 
		POST
			email: "",
 			password: ""
	 *
	 */

	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@Valid @RequestBody UserLoginDTO userLoginDTO) {
		return ResponseEntity.status(HttpStatus.OK).body(clientService.loginUser(userLoginDTO));
	}
	
	/*
	 * http://localhost:3000/register
		POST
			name: "",
		    email: "",
		    password: "",
		    confirm_password: ""
	 * 
	 */

	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@Valid @RequestBody UserRegisterDTO userRegisterDTO) {
		return ResponseEntity.status(HttpStatus.CREATED).body(clientService.registerUser(userRegisterDTO));
	}
	
	
	
	
}
