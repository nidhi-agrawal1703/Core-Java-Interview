package com.rays.string;

public class StringImmutableOrNot {
	
	public static void main(String[] args) {
		
		//String is immutable,then it will not change
		String s1="Nidhi";
		s1.concat("Agrawal");
		System.out.println(s1);
		
		//If we hold that in object,it can be edited
		s1=s1.concat("Agrawal");
		System.out.println(s1);
		
		//StringBuffer is Immutable
		StringBuffer sb=new StringBuffer("Nidhi");
		sb.append("Agrawal");
		System.out.println(sb);
	}
}
