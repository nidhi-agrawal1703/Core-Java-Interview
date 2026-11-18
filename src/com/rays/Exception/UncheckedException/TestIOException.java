package com.rays.Exception.UncheckedException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * IOException is direct parent of FileNotFoundException,
 * so even if FileNotFoundException is not written it is handled by IOException
 * @author Nidhi
 *
 */
public class TestIOException {
	
	public static void main(String[] args) {
		try {
			FileReader file=new FileReader("src/hi.txt");
			//file.read();
		}catch (FileNotFoundException e1) {
		System.out.println("File not found");	
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
