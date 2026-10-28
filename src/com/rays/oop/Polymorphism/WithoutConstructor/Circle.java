package com.rays.oop.Polymorphism.WithoutConstructor;

public class Circle extends Shape {
	
	private int radius;
	public static final double pi=3.14;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	public double area() {
		return pi*radius*radius;
	}
}
