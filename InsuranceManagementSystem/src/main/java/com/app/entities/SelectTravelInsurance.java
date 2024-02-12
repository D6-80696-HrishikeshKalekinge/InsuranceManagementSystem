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
public class SelectTravelInsurance extends BaseDInsurance{
	
	@Column(nullable = false)
	private int medicalExpenses;
	
	@Column(nullable = false)
	private int lossOfPassport;
	
	@Column(nullable = false)
	private int baggageLost;
	
//	@Column(nullable = false)
//	private int tripCancellation;
	
//	@Column(nullable = false)
//	private int personalAccident;

}