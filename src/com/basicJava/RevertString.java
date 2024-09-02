package com.basicJava;

import java.util.Scanner;

public class RevertString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String input = scanner.nextLine();
		
		System.out.println("Original String = " + input);
		
		char[] storeString = input.toCharArray();
		
//		System.out.println(storeString.length);
		String output = "";
		for(int i=storeString.length-1; i>=0; i--) {
			output += storeString[i];
		}
		System.out.println("Reversed String = "+output);
	}
}
