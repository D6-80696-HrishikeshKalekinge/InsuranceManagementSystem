package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.SelectCarInsuranceDao;
import com.app.daos.SelectHealthInsuranceDao;
import com.app.daos.SelectHomeInsuranceDao;
import com.app.daos.SelectTermLifeInsuranceDao;
import com.app.daos.SelectTravelInsuranceDao;
import com.app.entities.SelectCarInsurance;
import com.app.entities.SelectHealthInsurance;
import com.app.entities.SelectHomeInsurance;
import com.app.entities.SelectTermLifeInsurance;
import com.app.entities.SelectTravelInsurance;


@Service
@Transactional
public class SelectInsuranceServiceImpl implements SelectInsuranceService{
	
	@Autowired
	private SelectHealthInsuranceDao healthInsuranceDao;
	
	@Autowired
	private SelectCarInsuranceDao carInsuranceDao;
	
	@Autowired
	private SelectTravelInsuranceDao travelInsuranceDao;
	
	@Autowired
    private SelectHomeInsuranceDao homeInsuranceDao;
	
	@Autowired
	private SelectTermLifeInsuranceDao termLifeInsuranceDao;


	@Override
	public List<SelectCarInsurance> getAllCarInsurance() {
		return carInsuranceDao.findAll();
	}

	@Override
	public List<SelectHealthInsurance> getAllHealthInsurance() {
		return healthInsuranceDao.findAll();
	}

	@Override
	public List<SelectTravelInsurance> getAllTravelInsurance() {
		return travelInsuranceDao.findAll();
	}
	
	@Override
	public List<SelectHomeInsurance> getAllHomeInsurance(){
		return homeInsuranceDao.findAll();
	}

	@Override
	public List<SelectTermLifeInsurance> getAllTermLifeInsurance(){
		return termLifeInsuranceDao.findAll();
	}

}
