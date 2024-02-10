package com.app.entities.policies;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_insurance_table")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CarInsurance extends Insurances {
	
	private String carNo;
	
	private String carType;
	
	private Date registrationDate;
	
}
