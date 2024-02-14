package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.services.SelectInsuranceService;

@RestController("/select")
public class SelectInsuranceController {
	
	@Autowired
	private SelectInsuranceService selectInsuranceService;
	
	@GetMapping("/selectcar")
	public ResponseEntity<?> getAllCarInsurance() {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(selectInsuranceService.getAllCarInsurance());
	}
	
	@GetMapping("/selecthealth")
	public ResponseEntity<?> getAllHealthInsurance() {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(selectInsuranceService.getAllHealthInsurance());
	}
	
	@GetMapping("/selecttravel")
	public ResponseEntity<?> getAllTravelInsurance() {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(selectInsuranceService.getAllTravelInsurance());
	}
	
	@GetMapping("/selecthome")
	public ResponseEntity<?> getAllHomeInsurance() {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(selectInsuranceService.getAllHomeInsurance());
	}
	
	@GetMapping("/selecttermLife")
	public ResponseEntity<?> getAllTermLifeInsurance() {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(selectInsuranceService.getAllTermLifeInsurance());
	}
}