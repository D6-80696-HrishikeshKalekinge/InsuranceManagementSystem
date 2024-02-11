package com.app.services;

import java.util.ArrayList;
import java.util.List;

import com.app.DTO.CarInsuranceDTO;
import com.app.daos.*;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.CarInsuranceDao;
import com.app.policies.CarInsurance;

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
	public List<CarInsuranceDTO> getAllCarInsurances() {
		List<CarInsuranceDTO> cars = new ArrayList<>();
		for(CarInsurance car : carInsuranceDao.findAll()) {
			CarInsuranceDTO CDTO = mapper.map(car, CarInsuranceDTO.class);
			CDTO.setClientId(car.getClient().getId());
			cars.add(CDTO);
		}
		
		return cars;
	}

	@Override
	public boolean buyCarInsurance(CarInsuranceDTO carInsurance) {
		CarInsurance car = mapper.map(carInsurance, CarInsurance.class);
		car.setClient(clientDao.findById(carInsurance.getClientId()).get());
		carInsuranceDao.save(car);
		return true;
	}

}
