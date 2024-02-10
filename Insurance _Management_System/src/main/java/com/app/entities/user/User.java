package com.app.entities.user;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer userId;

	@Column(length = 30, nullable = false)
	private String name;
	
	@Column(length = 40, nullable = false)
	private String email;
	
	@Column(length = 20, nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 10, nullable = false)
	private UserRole role;

	
}
