package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "city_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cityId;

	@Column(length = 20)
	private String cityName;

	@OneToOne
	private States state;

}
