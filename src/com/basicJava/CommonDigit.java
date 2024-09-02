//PRACTICAL-2:Write a Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers
package com.basicJava;

import java.util.Scanner;

public class CommonDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a two numbers between 25 to 75 :");
		System.out.println("Enter number - 1 : ");
		int n1 = scanner.nextInt();
		System.out.println("Enter number - 2 : ");
		int n2 = scanner.nextInt();
		
		System.out.println(checkNumber(n1,n2)); 
		
//		
////		System.out.println("Enter a two numbers between 25 to 75 :");
//		if (n1 <= 75 || n2 >= 25) {
//			if (n1 % 10 == n2 % 10) {
//				System.out.println(n1 + " and " + n2 + " contains a common number is = " + n1 % 10);
//				System.out.println("True");
//			} else {
//				System.out.println(n1 + " and " + n2 + " does not contains a common number.");
//				System.out.println("False");
//			}
//		} else {
//			System.out.println("Please enter a number between 25 and 75...");
//		}

	}
	
	public static boolean checkNumber(int x, int y) { //45, 56
		if(!(x<75 || y>25 || x>25 || y<75)) {
//			System.out.println("Please enter a number between 25 and 75...");
			return false;
		}
		
		int a = x%10; //
		int b = y%10;
		
		int c = x/10;
		int d = y/10;
		
		System.out.println("a:"+a+"b:"+ b+"c:"+c+"d:"+d);
		return (a==b || a==d || b==c || c==d) ? true : false;
	}
}
