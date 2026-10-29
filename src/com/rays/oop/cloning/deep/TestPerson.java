package com.rays.oop.cloning.deep;

public class TestPerson {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address privateAddress=new Address("Washington");
		
		Person p1=new Person("Nidhi",privateAddress);
		
		Person p2=(Person)p1.clone();
		p2.address.city="London";
		
		//p1 is unaffected by change in p2
		System.out.println("P1 address="+p1.address.city);
		System.out.println("P2 address="+p2.address.city);
	}
}
