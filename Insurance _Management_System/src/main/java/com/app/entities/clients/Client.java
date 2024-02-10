package com.app.entities.clients;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.app.entities.policies.Insurances;
import com.app.entities.policies.Policy;
import com.app.entities.user.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "client_table")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Client extends User {

	private Date dob;

	private Integer AnnualIncome;

	@Enumerated(EnumType.STRING)
	@Column(length = 6)
	private Gender gender;

	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private MaritalStatus maritalStatus;

	@OneToOne
	@JoinColumn(name = "state_id")
	private States state;

	@OneToOne
	@JoinColumn(name = "city_id")
	private City city;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "client")
	private List<Policy> insurances;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "clientId")
	private AssetsDetails assetsDetails;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "clientId")
	private FamilyDetails familyDetails;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "clientId")
	private ContactDetails contactDetails;

}
