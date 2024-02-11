package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.PolicyDao;
import com.app.entities.policies.Policy;

@Service
@Transactional
public class PolicyServiceImpl implements PolicyService{

	@Autowired
	private PolicyDao policyDao;
	
	@Override
	public List<Policy> getAllPoliciesOfUser(long clientId) {
		return policyDao.findByClient(clientId);
	}
}
