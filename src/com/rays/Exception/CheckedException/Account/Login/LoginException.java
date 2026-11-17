package com.rays.Exception.CheckedException.Account.Login;

public class LoginException extends Exception {
	
	public LoginException() {
		super("Invalid Login Id");
	}
}
