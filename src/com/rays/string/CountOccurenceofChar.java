package com.rays.string;

public class CountOccurenceofChar {
	
	public static void main(String[] args) {
		
		String n="Nidhi Agrawal";
		
		char ch='a';
		
		int count=0;
		
		for(int i=0;i<n.length();i++) {
			
			if(n.charAt(i)==ch) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(ch+"="+count);
		}
	}
}
