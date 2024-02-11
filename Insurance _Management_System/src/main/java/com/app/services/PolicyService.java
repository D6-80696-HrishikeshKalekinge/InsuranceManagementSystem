package com.app.services;

import java.util.List;

import com.app.entities.policies.Policy;

public interface PolicyService {

	List<Policy> getAllPoliciesOfUser(int clientId);

	List<Policy> getAllPolicy();

}
