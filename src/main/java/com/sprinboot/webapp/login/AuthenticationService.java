package com.sprinboot.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		return username.equalsIgnoreCase("sindhu") && password.equalsIgnoreCase("password");
	}
	
}
