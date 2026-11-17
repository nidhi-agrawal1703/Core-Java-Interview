package com.rays.Exception.UncheckedException;

public class TestNumberFormatException {
	
	public static void main(String[] args) {
		try {
			String str="Nidhi1234";
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
