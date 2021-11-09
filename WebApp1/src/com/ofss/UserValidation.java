package com.ofss;

public class UserValidation {
	public static boolean validateUser(String un, String pwd) {
		if(un.equals(pwd)) {
			return true;
		} else {
			return false;
		}
	}
}
