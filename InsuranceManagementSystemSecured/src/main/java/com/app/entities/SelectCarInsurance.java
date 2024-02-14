package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

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
public class SelectCarInsurance extends BaseDInsurance{

	@Column(nullable = false)
	private double idvCover;
	
	@Column(nullable = false)
	private String claimsSettled;
	
	@Column(nullable = false)
	private String addOns;
}	