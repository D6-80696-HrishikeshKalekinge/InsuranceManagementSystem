//package com.app.entities.policies;
//
//import java.sql.Date;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.MappedSuperclass;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//import com.app.entities.policyproviders.PolicyProvider;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@Table(name = "insurance_table")
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//public class Insurances { // removed
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer insuranceId;
//	
////	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "insurances",fetch = FetchType.EAGER)
////	private List<PolicyProvider> policyprovider = new ArrayList<>();
////	// many insurance can have many providers
//	
//	
//}


