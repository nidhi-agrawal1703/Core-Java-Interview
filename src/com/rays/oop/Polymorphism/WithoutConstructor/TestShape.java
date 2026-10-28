package com.rays.oop.Polymorphism.WithoutConstructor;
/**
 * 
 * @author Nidhi
 *We have not used constructor to set values during instantiation
 *Here reference of Circle is upcasted to Shape first
 *Then same Shape object is downcasted to circle because we have to set radius of Circle by 
 *calling setRadius from Circle class as method of the class holding the reference will be called.
 *For example methods of Shape class can be called by shapes[0] also,members of Shape can be accessed and not of Circle
 */
public class TestShape {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[1];
		shapes[0]=new Circle();//Upcasting circle to Shape 
		Circle c=(Circle)shapes[0];//Downcasting to circle
		c.setRadius(10);
		for(int i=0;i<shapes.length;i++) {
			System.out.println(shapes[i].area());
		}
		
	}

}