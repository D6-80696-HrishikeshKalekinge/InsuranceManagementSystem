package com.app.services;

import java.util.List;

import com.app.entities.SelectCarInsurance;
import com.app.entities.SelectHealthInsurance;
import com.app.entities.SelectHomeInsurance;
import com.app.entities.SelectTermLifeInsurance;
import com.app.entities.SelectTravelInsurance;

public interface SelectInsuranceService {
	
	

	List<SelectCarInsurance> getAllCarInsurance();
	
	List<SelectHealthInsurance> getAllHealthInsurance();
	
	List<SelectTravelInsurance> getAllTravelInsurance();
	
	List<SelectTermLifeInsurance> getAllTermLifeInsurance();

	List<SelectHomeInsurance> getAllHomeInsurance();
}
