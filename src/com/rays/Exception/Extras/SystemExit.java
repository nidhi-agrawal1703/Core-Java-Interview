package com.rays.Exception.Extras;
/**
 * System.exit() leads to termination of program,
 * even finally block will not be executed
 * @author Nidhi
 *
 */
public class SystemExit {
	
	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println(str.length());
		} catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.exit(0);
		}finally {
			System.out.println("This will execute finally");
		}
	}
}
