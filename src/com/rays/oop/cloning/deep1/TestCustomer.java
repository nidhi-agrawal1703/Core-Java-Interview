package com.rays.oop.cloning.deep1;

public class TestCustomer {
	public static void main(String[] args) throws CloneNotSupportedException {
		Account acc=new Account(10000);
		
		Customer c1=new Customer("Nidhi",acc);
		
		Customer c2=(Customer)c1;
		
		c2.name="Rays";
		c2.account.balance=2000;
		
		System.out.println("c1 Name = "+c1.name);
		System.out.println("c1 balance = "+c1.account.balance);
		
		System.out.println("------------------");
		
		
		
		System.out.println("c2 Name = "+c2.name);
		System.out.println("c2 balance = "+c2.account.balance);
		
	}
}
