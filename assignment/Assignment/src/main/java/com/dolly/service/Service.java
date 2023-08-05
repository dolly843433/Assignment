package com.dolly.service;

import java.util.List;

import com.dolly.model.CustomerModel;



public interface Service {
	public  String  insertcustomer(CustomerModel model);
	public List<CustomerModel> getcustomer();
	public String update(String customer_id,CustomerModel model);
	public String deletecustomer(String customer_id);
    public CustomerModel findOne(String custome_id);
}
