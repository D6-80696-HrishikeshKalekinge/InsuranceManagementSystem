package com.app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entities.policies.Policy;

@Repository
public interface PolicyDao extends JpaRepository<Policy, Integer>{

	@Query("select p from Policy p where p.client = :clientId")
	List<Policy> findByClient(long clientId);

}