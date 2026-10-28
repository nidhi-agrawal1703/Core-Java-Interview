package com.rays.javabasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	
	public static void main(String[] args) throws ParseException {
		
		String date="17-12-2006";
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		Date d=sdf.parse(date);
		
		System.out.println(d);
	}
}
