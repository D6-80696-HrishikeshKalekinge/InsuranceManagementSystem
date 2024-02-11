package com.app.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.policies.TravelInsurance;

@Repository
public interface TravelInsuranceDao extends JpaRepository<TravelInsurance, Integer>{

}
