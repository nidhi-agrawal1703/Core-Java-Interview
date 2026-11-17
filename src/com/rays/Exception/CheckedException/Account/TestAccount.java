package com.rays.Exception.CheckedException.Account;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account acc=new Account();
		
		acc.setBalance(1000);
		
		try {
			acc.withdrawal(5000);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
}
