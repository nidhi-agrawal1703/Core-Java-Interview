package com.rays.oop.Polymorphism.WithConstructor;

public class Triangle extends Shape {

	private int base;
	private int height ;
	public static double constant=0.5;
	
	public Triangle(int base,int height) {
		this.base=base;
		this.height=height;
	}
		
	public double area() {
		return constant*base*height;
	}
}
