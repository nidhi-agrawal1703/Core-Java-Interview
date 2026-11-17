package com.rays.Exception.CheckedException.Account;

public class Account {
	
	private int balance;
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int deposit(int amount) {
		balance=balance+amount;
		return balance;
	}
	
	public int withdrawal(int amount) throws InsufficientBalanceException {
		if(balance <amount) {
			throw new InsufficientBalanceException();
		}else {
			balance=balance-amount;
		}
		return balance;
	}
	
}
