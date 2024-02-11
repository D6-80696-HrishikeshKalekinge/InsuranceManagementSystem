package com.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.PolicyDao;
import com.app.daos.UserDao;
import com.app.entities.clients.Client;
import com.app.entities.policies.Policy;

@Service
@Transactional
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PolicyDao policyDao;

	@Autowired
	private UserDao userDao;

	@Override
	public List<Policy> getAllPoliciesOfUser(int clientId) {
		List<Policy> res = new ArrayList<>();
		Client persistentClient = (Client) userDao.findById(clientId).get();
		System.err.println("Client from DB -> L1");
		
		List<Policy> persistentPolicies = policyDao.findAll();
		for (Policy policy : persistentPolicies) {
			if (policy.getClient() == persistentClient)
				res.add(policy);
		}
//		return policyDao.findByClient(client);

		return res;
	}

	@Override
	public List<Policy> getAllPolicy() {
		return policyDao.findAll();
	}
}
