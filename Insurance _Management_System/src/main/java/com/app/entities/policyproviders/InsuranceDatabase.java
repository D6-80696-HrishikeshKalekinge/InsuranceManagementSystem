//package com.app.entities.policyproviders;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Table(name = "insurance_db_table")
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
//public class InsuranceDatabase {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer InsuranceId;
//	
//	private String img;
//	
//	private int premium;
//	
//	// private int 
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "policy_provider")
//	private PolicyProvider providers;
//	
//	
//}
