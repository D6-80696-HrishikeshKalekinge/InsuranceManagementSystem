package com.app.entities.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "states_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class States {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stateId;

	private String stateName;

}