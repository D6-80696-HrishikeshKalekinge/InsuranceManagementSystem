package com.app.services;

import java.util.ArrayList;
import java.util.List;

import com.app.DTO.CarInsuranceDTO;
import com.app.DTO.HomeInsuranceDTO;
import com.app.DTO.TravelInsuranceDTO;
import com.app.daos.*;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.policies.CarInsurance;
import com.app.policies.HomeInsurance;
import com.app.policies.TravelInsurance;

@Service
@Transactional
public class HomeInsuranceServiceImpl implements HomeInsuranceService {

	@Autowired
	private HomeInsuranceDao homeInsuranceDao;

	@Autowired
	private ClientDao clientDao;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<HomeInsuranceDTO> getAllHomeInsurances() {
		List<HomeInsuranceDTO> homes = new ArrayList<>();
		for (HomeInsurance home : homeInsuranceDao.findAll()) {
			HomeInsuranceDTO TDTO = mapper.map(homes, HomeInsuranceDTO.class);
			home.getClient().getHomeInsurances().size();
			TDTO.setClientId(home.getClient().getId());
			homes.add(TDTO);
		}

		return homes;
	}

	@Override
	public boolean buyHomeInsurance(HomeInsuranceDTO homeInsurance) {
		HomeInsurance travel = mapper.map(homeInsurance, HomeInsurance.class);
		travel.setClient(clientDao.findById(homeInsurance.getClientId()).get());
		homeInsuranceDao.save(travel);
		return true;
	}

	@Override
	public HomeInsuranceDTO getHomeInsurances(Integer clientId) {
		if (clientDao.existsById(clientId))
			return mapper.map(homeInsuranceDao.findByClientId(clientId), HomeInsuranceDTO.class);
		else
			return new HomeInsuranceDTO();
	}

}
