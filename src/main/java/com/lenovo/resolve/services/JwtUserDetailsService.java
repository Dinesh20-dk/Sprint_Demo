package com.lenovo.resolve.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.lenovo.resolve.entity.UserLoginEntity;
import com.lenovo.resolve.model.UserDto;
import com.lenovo.resolve.repository.UserRepository;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserLoginEntity user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
	}

	public UserLoginEntity save(UserDto user) {
		System.out.println("Password=="+user.getPassword());
	    UserLoginEntity newUser = new UserLoginEntity();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
   	    newUser.setAccountType("Resolve");
   	    newUser.setSuppType("Admin");
		return userRepository.save(newUser);
	}
}