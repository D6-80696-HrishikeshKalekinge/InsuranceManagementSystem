package com.app.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.policies.CarInsurance;


@Repository
public interface CarInsuranceDao extends JpaRepository<CarInsurance, Integer>{

}
