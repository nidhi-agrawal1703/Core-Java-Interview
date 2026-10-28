package com.rays.javabasics;

public class BubbleSortDesc {
	
	public static void main(String[] args) {
		
		int[] arr= {5,1,67,78,2,10};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
}
