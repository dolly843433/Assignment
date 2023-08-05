package com.dolly.service;

import com.dolly.model.LoginModel;

public interface loginservice {

	public String register(LoginModel model);
	public String login(LoginModel model);
	
}
