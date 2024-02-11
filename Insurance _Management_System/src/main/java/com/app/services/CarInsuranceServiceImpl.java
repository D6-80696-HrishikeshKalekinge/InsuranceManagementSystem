package com.app.services;

import java.util.List;
import com.app.daos.*;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.CarInsuranceDao;
import com.app.entities.policies.CarInsurance;
import com.app.entities.policies.Policy;

@Service
@Transactional
public class CarInsuranceServiceImpl implements CarInsuranceService{

	@Autowired
	private CarInsuranceDao carInsuranceDao;
	
	@Autowired
	private PolicyDao PolicyDao;
	
	@Autowired
	private UserDao clientDao;
	
	@Override
	public List<CarInsurance> getAllCarInsurances() {
		return carInsuranceDao.findAll();
	}

	@Override
	public boolean buyCarInsurance(CarInsurance carInsurance, Integer clientId) {
		CarInsurance insurance = carInsuranceDao.save(carInsurance);
		PolicyDao.save(new Policy(insurance, insurance.getPolicyprovider().get(0), clientDao.findById(clientId).get()));
		return true;
	}

}
