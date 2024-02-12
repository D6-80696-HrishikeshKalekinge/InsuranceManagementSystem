package com.app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.SelectHealthInsurance;

@Repository
public interface SelectHealthInsuranceDao extends JpaRepository<SelectHealthInsurance, Integer>{
	
	List<SelectHealthInsurance> findAll();

}
