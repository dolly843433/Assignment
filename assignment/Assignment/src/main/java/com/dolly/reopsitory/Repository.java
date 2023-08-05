package com.dolly.reopsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dolly.model.CustomerModel;

public interface Repository  extends JpaRepository<CustomerModel , String>{

}
