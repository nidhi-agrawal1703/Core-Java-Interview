package com.rays.oop.encapsulation;

import java.util.Date;

public class Account {
	
	private String number;
	private String type;
	private double balance;
	private Date dateOfCreation;
	public static final double minBalance=5000;
	
	public void setDateOfCreation(Date d) {
		this.dateOfCreation=d;
	}
	
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number=number;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double deposit(int amount) {
		balance=balance+amount;
		System.out.println(amount+" deposited");
		System.out.println("Total Balance = "+balance);
		return balance;
	}
	
	public double withdraw(int amount) {
		if(amount<balance) {
			balance=balance-amount;
			System.out.println(amount+" withdrawn");
		}else {
			System.out.println("Insufficient funds");
		}		
		System.out.println("Total Balance = "+balance);
		return balance;
	}
	
}
