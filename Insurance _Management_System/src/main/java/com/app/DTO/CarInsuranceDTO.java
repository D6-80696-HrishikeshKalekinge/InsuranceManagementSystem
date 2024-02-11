package com.app.DTO;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.entities.Client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CarInsuranceDTO {
	private Date startDate;
	
	private int premium;
	
	private int period = 12; 
	
	private String vendorName;
	
	private Integer vendorId;
	
	private Integer idvCover;
	
	private String claimSetted; 
	
	private String addOns;
	
	private Integer client;
	
	private String carRegNo;
	
	private String carType;
	
	private Date regDate;
}
