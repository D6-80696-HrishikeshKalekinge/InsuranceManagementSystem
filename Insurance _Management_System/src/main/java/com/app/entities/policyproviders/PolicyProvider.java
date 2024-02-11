package com.app.entities.policyproviders;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.app.entities.policies.Insurances;
import com.app.entities.policies.Policy;
import com.app.entities.user.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy.Eager;

@Entity
@Table(name = "policy_provider_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PolicyProvider extends User{
	
	private String companyName;
		
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Insurances> insurances = new ArrayList<>();
// 	Redundant 
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "policyProvider", fetch = FetchType.EAGER)
	private List<Policy> Policies = new ArrayList<>();
	
}
