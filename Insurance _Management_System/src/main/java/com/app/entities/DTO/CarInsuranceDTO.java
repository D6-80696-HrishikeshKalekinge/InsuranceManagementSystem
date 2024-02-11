package com.app.entities.DTO;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
public class CarInsuranceDTO {
	@NotBlank
	private String carRegNo;
	
	@NotBlank
	private String carType;
	
	@NotNull
	private Date regDate;
	
	// provider ID
	// Insurance ID
}
