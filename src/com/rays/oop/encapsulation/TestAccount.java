package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestAccount {
	public static void main(String[] args) throws ParseException {
		Account account=new Account();
		account.setNumber("XYZ123");
		account.setType("Savings");
		account.setBalance(15000);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		account.setDateOfCreation(sdf.parse("17-03-2006"));
		System.out.println("Account created at "+sdf.format(account.getDateOfCreation()));
		account.withdraw(2000);
	}
}
