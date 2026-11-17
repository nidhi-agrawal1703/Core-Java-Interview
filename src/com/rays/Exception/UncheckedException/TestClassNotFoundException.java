package com.rays.Exception.UncheckedException;

/**
 * This exception happens when class is not found when called by Class.forName
 * @author Nidhi
 *
 */
public class TestClassNotFoundException {
	public static void main(String[] args) {
		try {
		
			Class.forName("Exception.TestAccount");
			System.out.println("Class Found");
		} catch (ClassNotFoundException e) {
			
			System.out.println("Class Not found");
		}
	}

}
