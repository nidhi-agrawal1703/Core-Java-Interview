package com.rays.javabasics;

public class NoteCount {
	
	public static void main(String[] args) {
		
		int[] notes= {2000,500,100,50,20,10,5};
		
		int amount=4584612;
		
		int count=1;
		for(int i=0;i<notes.length;i++) {
			count=amount/notes[i];
			if(count>0) {
				System.out.println(notes[i] + "Count = "+count);
			}
			amount=amount%2000;
		}
	}
}
