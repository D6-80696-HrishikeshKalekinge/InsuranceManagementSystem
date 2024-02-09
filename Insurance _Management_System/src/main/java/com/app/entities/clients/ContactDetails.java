package com.app.entities.clients;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contacts_details_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContactDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer detailId;

	private String email;
	
	private long mobileNo;
	
	@OneToOne
	@JoinColumn(name = "client_id")
	private Client clientId;

}
