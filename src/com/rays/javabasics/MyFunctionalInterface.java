package com.rays.javabasics;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	public int sum(int a,int b);
	
	public static void sub(int a,int b) {
		System.out.println(a-b);
	}
	
	default void mul(int a,int b) {
		System.out.println(a*b);
	}
}
