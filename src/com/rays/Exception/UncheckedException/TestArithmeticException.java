package com.rays.Exception.UncheckedException;

public class TestArithmeticException {
	public static void main(String[] args) {
		
		try {
			int a=10/0;
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
	}
}
