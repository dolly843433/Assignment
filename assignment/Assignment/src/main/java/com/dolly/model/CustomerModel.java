package com.dolly.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_tbl")

public class CustomerModel {
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	@Column(name="customer_id")
	private String customer_id;
	
	@Column(name="first_name")
		private String first_name;
	@Column(name="last_name")
	
	private String last_name;
	@Column(name="adress")
	private String adress;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	public CustomerModel() {
		super();
	}
	public CustomerModel(String customer_id, String firstName, String lastName, String adress, String city, String state,
			String email, String phone) {
		super();
		this.customer_id = customer_id;
		first_name = firstName;
		last_name = lastName;
		this.adress = adress;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phone = phone;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String firstName) {
		first_name = firstName;
	}
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String lastName) {
		last_name = lastName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
