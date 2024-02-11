package com.app.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DTO.CarInsuranceDTO;
import com.app.DTO.HealthInsuranceDTO;
import com.app.dao.HealthInsuranceDao;
import com.app.daos.ClientDao;
import com.app.policies.CarInsurance;
import com.app.policies.HealthInsurance;

@Service
@Transactional
public class HealthInsuranceServiceImpl implements HealthInsuranceService{

	@Autowired
	private HealthInsuranceDao healthInsuranceDao;
	
	@Autowired
	private ClientDao clientDao;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<HealthInsuranceDTO> getAllHealthInsurances() {
		List<HealthInsuranceDTO> healths = new ArrayList<>();
		for(HealthInsurance health : healthInsuranceDao.findAll()) {
			HealthInsuranceDTO HDTO = mapper.map(health, HealthInsuranceDTO.class);
			health.getClient().getCarInsurances().size();
			HDTO.setClientId(health.getClient().getId());
			healths.add(HDTO);
		}
		
		return healths;
	}

	@Override
	public boolean buyHealthInsurance(HealthInsuranceDTO healthInsurance) {
		HealthInsurance health = mapper.map(healthInsurance, HealthInsurance.class);
		health.setClient(clientDao.findById(healthInsurance.getClientId()).get());
		healthInsuranceDao.save(health);
		return true;
	}
}
