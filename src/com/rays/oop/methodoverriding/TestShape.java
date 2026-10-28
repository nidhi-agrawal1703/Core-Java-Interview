package com.rays.oop.methodoverriding;

public class TestShape {
	
	public static void main(String[] args) {
		
		Rectangle rect=new Rectangle();
		rect.setLength(5);
		rect.setWidth(10);
		System.out.println("Area of Rectangle is "+rect.area());
		
		Triangle triangle=new Triangle();
		triangle.setBase(10);
		triangle.setHeight(20);
		System.out.println("Area of Triangle is "+triangle.area());
	}

}
