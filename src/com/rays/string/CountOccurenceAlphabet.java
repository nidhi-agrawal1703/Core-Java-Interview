package com.rays.string;

public class CountOccurenceAlphabet {
	
	public static void main(String[] args) {
		
		String str="Nidhi Agrawal";
		
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==ch) {
					count++;
				}
				
			}
			System.out.println(ch+" count="+count);
		}
	}
}
