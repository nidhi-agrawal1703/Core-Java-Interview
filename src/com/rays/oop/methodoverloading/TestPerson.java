package com.rays.oop.methodoverloading;

public class TestPerson {
	public static void main(String[] args) {
		Person p=new Person();
		
		p.login("nidhi@gmail.com");
		p.login("nidhi@gmail.com", "pass123");
		p.login("nidhi@gmail.com", "pass123","Nidhi");
	}
}
