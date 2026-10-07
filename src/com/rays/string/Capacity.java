package com.rays.string;
/**
 * StringBuffer initial capacity=16+length
 * StringBuffer new capacity = old capacity × 2 + 2
 * But if that capacity is still smaller than the required length, Java uses the required length.
 * @author Nidhi
 *
 */
public class Capacity {
	
	public static void main(String[] args) {
		
		StringBuffer n=new StringBuffer("Nidhi");
		
		System.out.println("Length ="+n.length());
		System.out.println("Capacity="+n.capacity());
		
		System.out.println(n.append("abcdefghijklmnopqrstuvwxyz"));
		System.out.println("Length ="+n.length());
		System.out.println("Capacity="+n.capacity());
		
		System.out.println(n.append("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
		System.out.println("Length ="+n.length());
		System.out.println("Capacity="+n.capacity());
	}
}
