package com.rays.Exception.UncheckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileNotFoundException {
	public static void main(String[] args) {
		try {
			File file=new File("src/hi.txt");
			Scanner scan =new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
}
