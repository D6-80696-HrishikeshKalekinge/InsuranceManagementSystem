package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.services.PolicyService;

@RestController
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;
	
	@GetMapping("clientId/{clientId}")
	public ResponseEntity<?> getAllPoliciesOfUser(@RequestParam long clientId) {
		return ResponseEntity.status(HttpStatus.OK).body(policyService.getAllPoliciesOfUser(clientId));
	}

}
