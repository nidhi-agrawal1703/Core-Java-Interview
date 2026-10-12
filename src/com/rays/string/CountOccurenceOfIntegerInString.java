package com.rays.string;

public class CountOccurenceOfIntegerInString {
	
	public static void main(String[] args) {
		
		String str="Nidhi123456";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println("Count of Integers is "+count);
	}
}
