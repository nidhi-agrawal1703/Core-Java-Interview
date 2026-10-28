package com.rays.javabasics;
/**
 * 
 * @author Nidhi
 *Three Armstrong Numbers are 153,370,371
 */
public class Armstrong {
	
	public static void main(String[] args) {
		
		int num=153;
		int n=num;
		int remainder=0;
		int temp=0;
		
		while(n>0) {
		remainder=n%10;
		temp=temp+remainder*remainder*remainder;
		n=n/10;
		}
		
		if(num==temp) {
			System.out.println(num+" is Armstrong");
		}else {
			System.out.println(num+" is not Armstrong");
		}
		
	}
}
