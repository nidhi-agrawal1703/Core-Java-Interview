package com.rays.javabasics;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int[] a= {50,47,63,20,15,98,778,65,32};
		int temp=0;
		temp=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>temp) {
				temp=a[i];
			}
		}
		System.out.println(temp);
	}
}
