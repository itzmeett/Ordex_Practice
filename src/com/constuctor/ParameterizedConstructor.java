//PRACTICAL-7:Parameterized Constructor:
//Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.
package com.constuctor;

class Dog {
	String name, color;

	Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + "]";
	}
}

public class ParameterizedConstructor {
	public static void main(String[] args) {
		Dog d1 = new Dog("Rockey", "Black");
		System.out.println(d1);
	}
}
