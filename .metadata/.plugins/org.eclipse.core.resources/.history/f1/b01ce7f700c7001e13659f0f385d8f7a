package com.app.entities.users;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer userId;

	private String name;

	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private String email;
	
	private String password;

	private Date dob;

	private Integer AnnualIncome;

	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;

	@OneToOne
	private States state;

	@OneToOne
	private City city;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "userId")
	private AssetsDetails assetsDetails;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "userId")
	private FamilyDetails familyDetails;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "userId")
	private ContactDetails contactDetails;

	@Override
	public String toString() {
		return String.format(
				"User [userId=%s, name=%s, gender=%s, email=%s, password=%s, dob=%s, AnnualIncome=%s, maritalStatus=%s, state=%s, city=%s]",
				userId, name, gender, email, password, dob, AnnualIncome, maritalStatus, state, city);
	}

	
}
