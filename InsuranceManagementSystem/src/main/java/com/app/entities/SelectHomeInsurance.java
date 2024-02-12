package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SelectHomeInsurance extends BaseDInsurance{

	@Column(nullable=false) 
	private Integer policyTerm;
	
//	@Column(nullable=false) 
//	private Double premium;
	
	@Column(nullable=false) 
	private String addOns;
	
}
