package com.rays.string;

public class CountVowelsInString {
	
	public static void main(String[] args) {
			
		char[] vowels= {'a','e','i','o','u'};
		
		String name="Nidhi Agrawal";
		
		for(int i=0;i<vowels.length;i++) {
			int count=0;
			for(int j=0;j<name.length();j++) {
				if(vowels[i]==name.charAt(j)) {
					count++;
				}
			}
			System.out.println(vowels[i]+" count="+count);
		}
		
	}
}
