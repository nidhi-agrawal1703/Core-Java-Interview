package com.rays.oop.methodoverloading;

public class Person {
	
	public void login(String login) {
		System.out.println("Login "+login);
	}
	
	public void login(String login,String password) {
		System.out.println("Login "+login);
		System.out.println("Password "+password);
	}
	
	public void login(String login,String password,String name) {
		System.out.println("Login "+login);
		System.out.println("Password "+password);
		System.out.println("Name "+name);
	}
}
