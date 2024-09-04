//PRACTICAL-11
package com.basicJava;

class Static {
	public static int counter = 0;

	Static() {
		counter++;
	}

	public static int getCount() {
		return counter;
	}
}

public class StaticVariable {
	public static void main(String[] args) {
		Static obj1 = new Static();
		Static obj2 = new Static();
		Static obj3 = new Static();
		
	System.out.println("Count : "+Static.getCount());
	}
}
