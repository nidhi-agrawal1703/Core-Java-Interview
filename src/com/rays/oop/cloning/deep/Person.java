package com.rays.oop.cloning.deep;

public class Person implements Cloneable{

	String name;
	Address address;
	
	Person(String name,Address address){
		this.name=name;
		this.address=address;
	}
	
	//Overriding clone() to enforce deep copy mechanism
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Person p1=(Person)super.clone();
		//Manually copy/instantiate internal mutable objects
		p1.address=new Address(this.address.city);
		return p1;
	}
}
