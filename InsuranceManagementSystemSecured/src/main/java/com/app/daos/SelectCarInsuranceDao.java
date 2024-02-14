package com.app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.SelectCarInsurance;

public interface SelectCarInsuranceDao extends JpaRepository<SelectCarInsurance, Integer>{

	List<SelectCarInsurance> findAll();
}
