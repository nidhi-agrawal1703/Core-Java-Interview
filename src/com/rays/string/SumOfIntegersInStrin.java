package com.rays.string;

public class SumOfIntegersInStrin {
	
	public static void main(String[] args) {
		
		String str="Nidhi123456";
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum=sum+Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println("Sum of all integers in string is"+sum);
	}
}
