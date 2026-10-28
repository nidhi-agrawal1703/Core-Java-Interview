package com.rays.javabasics;

public class SecondHighestNo {
	public static void main(String[] args) {
		
		int[] arr= {5,1,67,78,2,10};
		int max=0;
		int secondMax=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			if(arr[i]<max && arr[i]>secondMax) {
				secondMax=arr[i];
			}
		}
		System.out.println("Second Highest is "+secondMax );
	}
}
