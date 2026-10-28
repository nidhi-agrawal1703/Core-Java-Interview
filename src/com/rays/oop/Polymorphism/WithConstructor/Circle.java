package com.rays.oop.Polymorphism.WithConstructor;

public class Circle extends Shape {
	
	private int radius;
	public static final double pi=3.14;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	public double area() {
		return pi*radius*radius;
	}
}
