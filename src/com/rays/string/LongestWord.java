package com.rays.string;

public class LongestWord {
	
	public static void main(String[] args) {
	
		String str= "a ab abc abcd abcde";
		String longest="";
		
		String[] str1=str.split(" ");
		
		for(String word:str1) {
			if(word.length()>longest.length()) {
				longest=word;
			}
			
		}
		System.out.println("Longest Word " + longest);
	}
	
	
}
