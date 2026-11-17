package com.rays.Exception.CheckedException;
/**
 * Checked Exception is propagated from son to mom to dad
 * and finally handled by JVM as main also throws the exception
 * @author Nidhi
 *
 */
public class CheckedException {
	
	public static void main(String[] args)throws Exception {
		dad();
	}
	public static void dad() throws Exception{
		mom();
	}
	public static void mom() throws Exception {
		son();
	}
	public static void son() throws Exception {
		throw new Exception();
	}
}
