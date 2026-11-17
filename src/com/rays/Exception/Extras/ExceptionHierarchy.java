package com.rays.Exception.Extras;
/**
 * Child eXceptions are written first then parent exception is written
 * @author Nidhi
 *
 */
public class ExceptionHierarchy {
	
	public static void main(String[] args) {
		
		try {
			String str=null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}catch (Exception e) {
			System.out.println("Parent Exception");
		}finally {
			System.out.println("This will execute finally");
		}
	}
}
