package com.rays.Exception.UncheckedException;

/**
 * As RuntimeException is an unchecked exception 
 * thats why it is not necessary to write throws keyword.
 * Runtime Exception is thrown by son() and propagated to dad().
 * dad() also doesn't handles the exception,neither is exception handled by main method
 * Exception is handled by JVM.
 * @author Nidhi
 *
 */

public class UncheckedException {
	
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		mom();
	}
	public static void mom() {
		son();
	}
	public static void son() {
		throw new RuntimeException();
	}
}
