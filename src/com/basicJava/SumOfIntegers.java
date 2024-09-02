//PRACTICAL : 4 - Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
//Sample Output:
//
//Input the first number : 5                                             
//Input the second number: 10                                            
//Input the third number : 15                                            
//The result is: true
package com.basicJava;

import java.util.Scanner;

public class SumOfIntegers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Integer : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter Second Integer : ");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter Third Integer : ");
		int num3 = scanner.nextInt();
		
		boolean output = checkSum(num1, num2, num3);
		System.out.println(output);
		
	}
	
	public static boolean checkSum(int x, int y ,int z) {
		return (x + y) == z;
	}
}
