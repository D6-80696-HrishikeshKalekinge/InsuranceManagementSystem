package com.app.entities.DTO;

import java.sql.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import com.app.entities.clients.City;
import com.app.entities.clients.Gender;
import com.app.entities.clients.MaritalStatus;
import com.app.entities.clients.States;

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
