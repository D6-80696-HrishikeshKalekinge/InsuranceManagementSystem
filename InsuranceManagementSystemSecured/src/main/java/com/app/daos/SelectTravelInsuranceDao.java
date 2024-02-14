package com.app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.SelectTravelInsurance;

public interface SelectTravelInsuranceDao extends JpaRepository<SelectTravelInsurance, Integer>{
	
	List<SelectTravelInsurance> findAll();

}
