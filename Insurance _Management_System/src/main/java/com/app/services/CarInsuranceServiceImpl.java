package com.app.services;

import java.util.List;

import com.app.DTO.CarInsuranceDTO;
import com.app.daos.*;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.CarInsuranceDao;
import com.app.entities.policies.CarInsurance;

@Service
@Transactional
public class CarInsuranceServiceImpl implements CarInsuranceService{

	@Autowired
	private CarInsuranceDao carInsuranceDao;
	
	@Autowired
	private ClientDao clientDao;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public List<CarInsurance> getAllCarInsurances() {
		return carInsuranceDao.findAll();
	}

	@Override
	public boolean buyCarInsurance(CarInsuranceDTO carInsurance) {
		CarInsurance car = mapper.map(carInsurance, CarInsurance.class);
		car.setClient(clientDao.findById(carInsurance.getClient()).get());
		carInsuranceDao.save(car);
		return true;
	}

}
