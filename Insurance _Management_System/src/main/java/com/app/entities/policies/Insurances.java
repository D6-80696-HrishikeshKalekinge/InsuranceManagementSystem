package com.app.entities.policies;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "insurance_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Insurances {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer insuranceId;
	
//	@ManyToOne(cascade = CascadeType.ALL, mappedBy = "insurances")
//	private PolicyProvider policyprovider;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "insuranceType")
	private List<Policy> policies;
	
	private Date startDate;
	
	private int premium;
	
	private int period = 12;
}
