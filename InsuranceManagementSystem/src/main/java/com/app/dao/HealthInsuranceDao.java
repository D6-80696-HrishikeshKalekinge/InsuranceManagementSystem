package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.policies.HealthInsurance;

@Repository
public interface HealthInsuranceDao extends JpaRepository<HealthInsurance, Integer>{

}
