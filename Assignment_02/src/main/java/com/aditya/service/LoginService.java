package com.aditya.service;

public class LoginService {
	public boolean loginCheck(String username, String password) {
		if(username.equals("aditya") && password.equals("123"))
			return true;
		return false;
	}
}
