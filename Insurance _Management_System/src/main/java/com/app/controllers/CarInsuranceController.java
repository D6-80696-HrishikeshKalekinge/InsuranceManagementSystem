package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTO.CarInsuranceDTO;
import com.app.entities.policies.CarInsurance;
import com.app.services.CarInsuranceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController("/car-insurance")
@CrossOrigin(origins = "http://localhost:3000")
@Validated
public class CarInsuranceController {
	
	@Autowired
	private CarInsuranceService carInsuranceService;
	
	// Testing purpose
	@GetMapping("/car")
	public ResponseEntity<?> getAllCarInsurances() {
		return ResponseEntity.status(HttpStatus.OK).body(carInsuranceService.getAllCarInsurances());
	}

	/*
	 * http://localhost:3000/car-form
		POST
		Car Registration number 
			type="text"
			name="carRegNo"
		Car Type
			type="text"
			name="carType"
		Registration Date
			type="date"
			name="regDate
	*
	*/
	
	// send Client Id in param (token after implementation)
	@PostMapping
	public ResponseEntity<?> buyCarInsurance(@RequestBody CarInsuranceDTO carInsurance) {
		//TODO: process POST request
		return ResponseEntity.status(HttpStatus.CREATED).body(carInsuranceService.buyCarInsurance(carInsurance));
	}
	
	
	
	
	
	
	
}
