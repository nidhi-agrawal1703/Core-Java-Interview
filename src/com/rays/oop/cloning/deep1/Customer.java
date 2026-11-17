package com.rays.oop.cloning.deep1;

public class Customer implements Cloneable {
	
	public String name;
	
	public Account account;
	
	public Customer(String name,Account account) {
		this.name=name;
		this.account=account;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c=(Customer)super.clone();
		c.account=(Account)account;
		return c;
	}
}
