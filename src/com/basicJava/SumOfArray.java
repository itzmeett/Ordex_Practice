//PRACTICAL-20 : Sum of array
package com.basicJava;

public class SumOfArray {
	public static void main(String[] args) {
		int[] arr = {1,2,34,4,34,232,12,5,68,63,9};
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("Total : "+ sum);
	}
}
