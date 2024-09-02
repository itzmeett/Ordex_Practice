//PRACTICAL-3 : Write a Java program to insert a word in the middle of another string.
//Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
package com.basicJava;

public class InsertString {
	public static void main(String[] args) {
		String orignal = "Java 4.0";
		String subString = "Tutorial";
		
		String[] store = orignal.split(" ");
		
		String output = store[0] + " " + subString + " " + store[1];
		
		System.out.println(output);
	}
	
}
