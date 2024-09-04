//PRACRICAL - 12 : Static Methods:
//Write a Java program to create a class called "MathUtility" with a static method add that takes
//two integers and returns their sum. Demonstrate the usage of this static method in the main method
//without creating an instance of "MathUtility"
package com.basicJava;

import java.util.Scanner;

class MathUtility{
	
	public static int add(int n1, int n2) {
		return n1+n2;
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number-1 : ");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter Number-2 : ");
		int n2 = scanner.nextInt();
		
		 System.out.println("Addition of " + n1 + " + "+ n2 + " = " +MathUtility.add(n1, n2)); 
	}
}
