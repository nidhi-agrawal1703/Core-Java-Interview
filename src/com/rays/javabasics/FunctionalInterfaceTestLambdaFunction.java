package com.rays.javabasics;

public class FunctionalInterfaceTestLambdaFunction {
	
	public static void main(String[] args) {
		
		MyFunctionalInterface f=(a,b)->{return a+b;};
		
		System.out.println(f.sum(10, 20));
		
	}
}
