package com.rays.oop.Polymorphism.MethodReturn;

public class Triangle extends Shape {
		
	private int base;
	private int height;
	public static final double CONSTANT=3.14;
	
	public Triangle(int base,int height) {
		this.base=base;
		this.height=height;
	}
	
	public double area() {
		return CONSTANT*base*height;
	}
	
}
