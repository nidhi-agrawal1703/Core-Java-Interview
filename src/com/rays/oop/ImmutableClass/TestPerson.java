package com.rays.oop.ImmutableClass;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p1=new Person("Nidhi","Agrawal");
		
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
	}
}
