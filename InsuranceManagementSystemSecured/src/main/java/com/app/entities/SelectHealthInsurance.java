package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SelectHealthInsurance extends BaseDInsurance{

	@Column(nullable = false)
	private String coverAmount;
	
	@Column(nullable = false)
	private int cashlessHospitals;
	
//	@Column(nullable = false)
//	private String roomRentLimit;
	
	@Column(nullable = false)
	private String initialWaitingPeriod;
	
//	@Column(nullable = false)
//	private String coPay;
}