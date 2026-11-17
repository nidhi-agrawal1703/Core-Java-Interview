package com.rays.Exception.UncheckedException;

public class TestNullPointerException {
	
	public static void main(String[] args) {
		
		try {
			String str=null;			
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("String cannot be null,Null Pointer Exception");
		}
	
	}
}
