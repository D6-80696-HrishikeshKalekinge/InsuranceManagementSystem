package com.app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.SelectTermLifeInsurance;

public interface SelectTermLifeInsuranceDao extends JpaRepository<SelectTermLifeInsurance, Integer>{
	List<SelectTermLifeInsurance> findAll();

}
