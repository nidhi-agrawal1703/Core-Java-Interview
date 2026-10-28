package com.rays.javabasics;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int num=1234;
		int remainder=0;
		int sum=0;
		int n=num;
		
		while(n>0) {
			remainder=n%10;
			sum=sum*10+remainder;
			n=n/10;
		}
		System.out.println("REverse of number is "+sum);
	}
}
