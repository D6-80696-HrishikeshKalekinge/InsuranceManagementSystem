package com.app.entities.DTO;

import java.sql.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import com.app.entities.users.City;
import com.app.entities.users.Gender;
import com.app.entities.users.MaritalStatus;
import com.app.entities.users.States;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserRegisterDTO {
	@NotBlank
	private String name;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String password;

	private Date dob;

	private Integer AnnualIncome;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;

	@OneToOne
	private States state;

	@OneToOne
	private City city;
}
