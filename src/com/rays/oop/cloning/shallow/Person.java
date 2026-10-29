package com.rays.oop.cloning.shallow;

public class Person implements Cloneable {

	String name;
	Address address;
	
	Person(String name,Address address){
		this.name=name;
		this.address=address;
	}
	
	//Default clone() performs shallow cloning
	@Override
	protected Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}
