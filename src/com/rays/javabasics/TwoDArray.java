package com.rays.javabasics;

public class TwoDArray {
	
	public static void main(String[] args) {
		
		int[][] num=new int[5][10];
		
		for(int i=1;i<=num.length;i++) {
			for(int j=1;j<=num[0].length;j++) {
				System.out.print((i)*j+" ");
			}
			System.out.println("");
		}
		
	}
}
