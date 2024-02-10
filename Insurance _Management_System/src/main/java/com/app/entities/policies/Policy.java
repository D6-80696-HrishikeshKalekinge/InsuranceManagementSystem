package com.app.entities.policies;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.app.entities.clients.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "policy_table")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer policyId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "insurance_type") 
	private Insurances insuranceType;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

}
