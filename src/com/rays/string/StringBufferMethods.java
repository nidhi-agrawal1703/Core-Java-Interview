package com.rays.string;
/**
 * 
 * @author Nidhi
 *
 */
public class StringBufferMethods {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Nidhi");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.delete(0, 1));
		System.out.println(sb.insert(0, "n"));
		System.out.println(sb.toString());
		System.out.println(sb.append("Agrawal"));
		System.out.println(sb.reverse());
		
	}
}
