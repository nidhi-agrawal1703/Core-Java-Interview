package com.rays.oop.ImmutableClass;

public final class Person {//Make class final
	
	private String firstName;//Make instance variable private and final
	private String lastName;
	
	public Person() {}
	
	public Person(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}//Use constructor to set values
	
	//Make only getter methods and not setter methods
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
}
