package com.rays.oop.Polymorphism;

public class TestShape {
	
	public static void main(String[] args) {
		
		Rectangle rect=new Rectangle();
		rect.setLength(5);
		rect.setWidth(10);
		
		Triangle triangle=new Triangle();
		triangle.setBase(10);
		triangle.setHeight(20);
		
		Shape[] shapes=new Shape[2];
		shapes[0]=rect;
		shapes[1]=triangle;
		
		for(int i=0;i<shapes.length;i++) {
			System.out.println(shapes[i].area());
		}
		
	}

}
