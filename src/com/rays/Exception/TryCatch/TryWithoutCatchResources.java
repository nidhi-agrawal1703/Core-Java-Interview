package com.rays.Exception.TryCatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithoutCatchResources {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileReader reader=new FileReader("src/Exception/Account.java")) {
			System.out.println(reader.read());
		}
		System.out.println("File Found");
	}
}
