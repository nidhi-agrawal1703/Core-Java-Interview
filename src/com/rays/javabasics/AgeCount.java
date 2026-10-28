package com.rays.javabasics;

import java.util.Date;

public class AgeCount {
	public static void main(String[] args) {
		
		Date d=new Date();
		
		int currentYear=d.getYear();
		
		int birthYear=2006;
		
		int age=currentYear-birthYear+1900;
		
		System.out.println("Age is "+age);
	}
}
