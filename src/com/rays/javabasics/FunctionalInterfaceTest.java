package com.rays.javabasics;
/**
 * This is Functional Interface Test file with anonymous function
 * @author Nidhi
 *
 */
public class FunctionalInterfaceTest {
	
	public static void main(String[] args) {
		
		MyFunctionalInterface f=new MyFunctionalInterface() {
			
			@Override
			public int sum(int a,int b) {
				return a+b;
			}
		};
		
		System.out.println(f.sum(20, 10));
		
		MyFunctionalInterface.sub(20, 10);//Static method is called by Functional Inteface name
		
		f.mul(10, 20);//Default method is called by reference name		
	}
}
