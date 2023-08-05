package com.dolly.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Component
@Entity
@Table(name="login_tbl")
public class LoginModel {
	@Id
	@Column(name="login_id")
	private String login_id;
	@Column(name="password")
	private String password;
	public LoginModel() {
		super();
	}
	public LoginModel(String login_id, String password) {
		super();
		this.login_id = login_id;
		this.password = password;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
