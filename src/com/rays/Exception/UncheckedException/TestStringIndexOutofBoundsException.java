package com.rays.Exception.UncheckedException;

public class TestStringIndexOutofBoundsException {
	
	public static void main(String[] args) {
		
		try {
			String str="nidhi";
			System.out.println(str.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
