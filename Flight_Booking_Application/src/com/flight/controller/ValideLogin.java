package com.flight.controller;

public class ValideLogin {

	public boolean checkDetails(String name, String password) {
		if (name.equals("bala") && password.equals(password)) {
			return true;
		}
		return false;
	}

	

}
