package com.rays.Exception.TryCatch;

public class TryCatchInsideFinally {
	
	public static void main(String[] args) {
		try {
			System.out.println("Inside try");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inside catch");
		}finally {
			System.out.println("Inside finally");
			try {
				int c=10/0;
			} catch (ArithmeticException e2) {
				System.out.println("Arithmetic Exception division by 0 not possible");
			}
		}
	}
}
