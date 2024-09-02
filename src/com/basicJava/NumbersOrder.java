//PRACTICAL-5 : 
//	Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
//
//	Test Data
//	Input first number: 1524
//	Input second number: 2345
//	Input third number: 3321
//	Expected Output :
//
//	Increasing order
package com.basicJava;

import java.util.Scanner;

public class NumbersOrder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Integer : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter Second Integer : ");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter Third Integer : ");
		int num3 = scanner.nextInt();
		
		checkOrder(num1, num2, num3);
//		System.out.println(output);
		
	}
	
	public static void checkOrder(int x,int y,int z) {
		if(x>y && y>z) {
			System.out.println("Decreasing Order");
		}
		else if(z>y && y>x) {
			System.out.println("Increasing Order");
		}else {
			System.out.println("Neither Increasing or decreasing order");
		}
	}
}
