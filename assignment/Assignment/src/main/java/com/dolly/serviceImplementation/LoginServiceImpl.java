package com.dolly.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dolly.jwt.JwtUtelis;
import com.dolly.model.LoginModel;
import com.dolly.reopsitory.LoginRepository;
import com.dolly.security.UserDetail;
import com.dolly.service.loginservice;
@Service
public class LoginServiceImpl implements loginservice{

	@Autowired
	LoginRepository repo;
	
	@Autowired
	AuthenticationManager authmanager;
	
	@Autowired
	JwtUtelis util;
	
	@Override
	public String register(LoginModel model) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encrypted_password=encoder.encode(model.getPassword());
		model.setPassword(encrypted_password);
		repo.save(model);
		return "added";
	}

	@Override
	public String login(LoginModel model) {
		// TODO Auto-generated method stub
		try {
			org.springframework.security.core.Authentication auth = authmanager
					.authenticate(new UsernamePasswordAuthenticationToken(model.getLogin_id(), model.getPassword()));

			if (auth.isAuthenticated()) {
				UserDetail details = new UserDetail(model);
				String token = util.generateToken(details);
				return token;
			}
			return "user not authenticated";

		} catch (Exception e) {
			if (repo.findById(model.getLogin_id()).isPresent()) {
				LoginModel mdle = repo.findById(model.getLogin_id()).get();

				if (!mdle.getPassword().equals(model.getPassword())) {
					return "email or password does not match";
				}
			}
			return "there is an error";

		}
	}

}
