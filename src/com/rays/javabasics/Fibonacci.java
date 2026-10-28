package com.rays.javabasics;

public class Fibonacci {
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int sum=0;
		System.out.print("0 1 ");
		for(int i=0;i<10;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
		}
	}
}
