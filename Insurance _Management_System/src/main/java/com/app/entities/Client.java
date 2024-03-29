package com.app.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.app.entities.policies.CarInsurance;
import com.app.entities.user.User;
import com.app.entities.user.UserRole;

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
public class Client extends BaseEntity{

	@Column(length = 30, nullable = false)
	private String name;
	
	@Column(length = 40, nullable = false)
	private String email;
	
	@Column(length = 20, nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 10, nullable = false)
	private UserRole role;

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
	private List<CarInsurance> carInsurances = new ArrayList<>(); // design pattern
	// lazy init -> cascade must be done
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "clientId")
	private AssetsDetails assetsDetails;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "clientId")
	private FamilyDetails familyDetails;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "clientId")
	private ContactDetails contactDetails;
	
	
	public void addCar(CarInsurance car) {
		carInsurances.add(car);
		car.setClient(this);
	}
	public void removeCar(CarInsurance car) {
		carInsurances.remove(car);
		car.setClient(null);
	}

}
