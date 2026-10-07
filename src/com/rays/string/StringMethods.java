package com.rays.string;

/**
 * String Methods
 * String index starts from 0 
 * @author Nidhi
 *
 */

public class StringMethods {
	
	public static void main(String[] args) {
		
		String name = "Nidhi";
		String str = "Agrawal";

		System.out.println("Length ="+name.length());
		System.out.println(name.trim().length());
		System.out.println("Uppercase="+name.toUpperCase());
		System.out.println("Lowercase="+name.toLowerCase());
		System.out.println("Starts With="+name.startsWith("N"));
		System.out.println("Ends With="+name.endsWith("S"));
		System.out.println("Character at="+name.charAt(3));
		System.out.println("Index of e"+name.indexOf("e"));
		System.out.println("Last Index of="+name.lastIndexOf("e"));
		System.out.println(name.substring(1));
		System.out.println(name.trim());
		System.out.println(name.concat(str));
		System.out.println(str.concat(name));
		System.out.println(name.replace("Nidhi", "Rohit"));
	}
}
