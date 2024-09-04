//PRACTICAL-19:Write a Java program to create a method that takes a string as input and throws an 
//exception if the string does not contain vowels.

package com.exception;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) throws NoVowelExist {
		String string = "Meet";
	}


	public static void takesInput(String string) throws NoVowelExist {
		Scanner scanner = new Scanner(System.in);
		String vowel = "aeiouAEIOU";
		boolean vowelContains = false;
		System.out.println("Enter a String");
		String str = scanner.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (vowel.contains(str)) {
				vowelContains = true;
				break;
			} else {
//				throw new NoVowelExist("String does not contain any Vowels");
			}
		}
	}
	class NoVowelExist extends Exception {
		public NoVowelExist(String msg) {
			super(msg);
		}
	}

}
