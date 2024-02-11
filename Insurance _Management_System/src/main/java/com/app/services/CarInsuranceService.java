package com.app.services;

import java.util.List;

import com.app.entities.policies.CarInsurance;

public interface CarInsuranceService {

	List<CarInsurance> getAllCarInsurances();

	boolean buyCarInsurance(CarInsurance carInsurance, Integer clientId);


	
}
