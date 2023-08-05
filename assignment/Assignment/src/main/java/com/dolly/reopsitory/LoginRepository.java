package com.dolly.reopsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dolly.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel,String > {

}
