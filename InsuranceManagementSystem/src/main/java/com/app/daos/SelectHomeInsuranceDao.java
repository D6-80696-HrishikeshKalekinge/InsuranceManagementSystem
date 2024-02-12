package com.app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.SelectHomeInsurance;

public interface SelectHomeInsuranceDao extends JpaRepository<SelectHomeInsurance, Integer>{
	
	List<SelectHomeInsurance> findAll();

}
