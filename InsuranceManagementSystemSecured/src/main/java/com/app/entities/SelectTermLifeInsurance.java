package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.app.entities.BaseDInsurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SelectTermLifeInsurance extends BaseDInsurance{

	@Column(nullable=false) 
	private Integer coverageTill;
	
	@Column(nullable=false) 
	private String claimsSettled;
	
	@Column(nullable=false) 
	private Double cover;
	
}