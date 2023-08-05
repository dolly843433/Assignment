package com.dolly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dolly.model.CustomerModel;
import com.dolly.service.Service;

@CrossOrigin("*")
@RestController
public class Controller {
@Autowired
Service service;


@GetMapping("/getall")
public ResponseEntity<List<CustomerModel>> getall(){
	return new  ResponseEntity<>(service.getcustomer(),HttpStatus.OK);
}

@PostMapping("/post")
public ResponseEntity<String>create(@RequestBody CustomerModel model){
	return new  ResponseEntity<>(service.insertcustomer(model),HttpStatus.CREATED);
}

@PutMapping("/update/{customer_id}")

public ResponseEntity<String>update(@RequestBody CustomerModel model,@PathVariable("customer_id") String customer_id ){
	return new  ResponseEntity<>(service.update(customer_id, model),HttpStatus.OK);
}

@DeleteMapping("/delete/{customer_id}")
public ResponseEntity<String>delete(@PathVariable("customer_id")String customer_id){
	return new  ResponseEntity<>(service.deletecustomer(customer_id),HttpStatus.ACCEPTED);
}

@GetMapping("/find/{customer_id}")
public ResponseEntity<CustomerModel> findone(@PathVariable("customer_id") String customer_id){
	return new ResponseEntity<>(service.findOne(customer_id),HttpStatus.OK);
}
}
