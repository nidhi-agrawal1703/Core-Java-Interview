package com.rays.javabasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
	public static void main(String[] args) {
		
		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat();
		
		String str=sdf.format(d);
		
		System.out.println(str);
	}
}
