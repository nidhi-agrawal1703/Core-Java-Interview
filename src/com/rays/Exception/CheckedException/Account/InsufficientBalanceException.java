package com.rays.Exception.CheckedException.Account;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException() {
		super("Insufficient balance");
	}

}
