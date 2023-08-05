package com.dolly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dolly.model.LoginModel;
import com.dolly.service.loginservice;

@CrossOrigin("*")
@RestController
public class LoginController {
	
	@Autowired
	loginservice service;

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginModel model){
		return new  ResponseEntity<>(service.login(model),HttpStatus.OK);

	}
	
	@PostMapping("/registration")
	public ResponseEntity<String> registration(@RequestBody LoginModel model){
		return new  ResponseEntity<>(service.register(model),HttpStatus.CREATED);

	}
	
}
