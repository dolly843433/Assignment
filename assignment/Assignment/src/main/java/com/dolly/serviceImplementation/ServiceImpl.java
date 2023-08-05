package com.dolly.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.dolly.model.CustomerModel;
import com.dolly.reopsitory.Repository;
import com.dolly.service.Service;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	@Autowired
	Repository  repo;
	@Override
	public String insertcustomer(CustomerModel model) {
		// TODO Auto-generated method stub
		repo.save(model);
		return "Sucessfully created";
	}

	@Override
	public List<CustomerModel> getcustomer() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	@Override
	public String update(String customer_id, CustomerModel model) {
		// TODO Auto-generated method stub
		CustomerModel m = repo.findById(customer_id).get();
		m.setFirstName(model.getFirstName());
		m.setLastName(model.getLastName());
		m.setAdress(model.getAdress());
		m.setCity(model.getCity());
		m.setState(model.getState());
		
		m.setEmail(model.getEmail());
		m.setPhone(model.getPhone());
		repo.save(m);
		return "Updated";
		
		
	}

	@Override
	public String deletecustomer(String customer_id) {
		// TODO Auto-generated method stub
		repo.deleteById(customer_id);
		return "Sucessfully deleted";
	}

	@Override
	public CustomerModel findOne(String custome_id) {
		// TODO Auto-generated method stub
		if(repo.findById(custome_id).isPresent()) {
			return repo.findById(custome_id).get();
		}else {
		return null;
		}
	}

}
