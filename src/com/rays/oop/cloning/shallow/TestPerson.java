package com.rays.oop.cloning.shallow;

public class TestPerson {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address sharedAddress=new Address("New York");
		Person p1=new Person("Nidhi",sharedAddress);
		
		Person p2=(Person)p1.clone();
		p2.address.city="Chicago";
		
		//As we change p2,it changed p1
		System.out.println(p1.address.city);
	}
}
