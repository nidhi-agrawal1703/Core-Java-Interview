package com.rays.javabasics;
/**
 * 
 * @author Nidhi
 *Few Palindrome Numbers are 1221,121,131,141....
 */
public class Palindrome {
	
	public static void main(String[] args) {
		
		int num=121;
		int n=num;
		int remainder=0;
		int sum=0;
		
		while(n>0) {
			remainder=n%10;
			sum=sum*10+remainder;
			n=n/10;
		}
		System.out.println(sum);
		if(sum==num) {
			System.out.println(num+" is Palindrome");
		}else {
			System.out.println(num+" is not Palindrome");
		}
		
		
	}
	
}
