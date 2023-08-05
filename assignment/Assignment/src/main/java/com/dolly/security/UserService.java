package com.dolly.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dolly.reopsitory.LoginRepository;
import com.dolly.model.LoginModel;
@Service
public class UserService implements UserDetailsService{
	@Autowired
	public LoginRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		LoginModel model=(LoginModel) repo.findById(username).get();
		
		return new UserDetail(model);
	}

}
