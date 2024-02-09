package com.app.entities.DTO;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserLoginDTO {
	@NotBlank
	private String token;
	@NotBlank
	private String email;
	@NotBlank
	private String password;
}
