package com.rays.string;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1="Nidhi";
		String s2="ihdiN";
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1,c2)) {
			System.out.println("It is an anagram");
		}else {
			System.out.println("It is not an anagram");
		}
		
	}
}
