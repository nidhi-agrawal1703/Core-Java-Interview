package com.rays.oop.Polymorphism.WithConstructor;
/**
 * 
 * @author Nidhi
 *We have used constructor to set values during instantiation
 */
public class TestShape {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[3];
		shapes[0]=new Rectangle(10,20);//Use of constructor to set values
		shapes[1]=new Triangle(45,32);
		shapes[2]=new Circle(10);
		
		for(int i=0;i<shapes.length;i++) {
			System.out.println(shapes[i].area());
		}
		
	}

}