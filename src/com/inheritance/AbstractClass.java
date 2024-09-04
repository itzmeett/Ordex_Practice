//PRACTICAL-17 : Write a Java program to create an abstract class Animal with abstract methods eat() 
//and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the 
//eat() and sleep() methods differently based on their specific behavior
package com.inheritance;

abstract class Animal{
	public abstract void eat();
	public abstract void sleep();
}

class Lion extends Animal{
	public void eat() {
		System.out.println("Lion is Eating");
	}
	
	public void sleep() {
		System.out.println("Lion is Sleeping");
	}
}

class Tiger extends Animal{
	public void eat() {
		System.out.println("Tiger is Eating");
	}
	
	public void sleep() {
		System.out.println("Tiger is Sleeping");
	}
}

class Deer extends Animal{
	public void eat() {
		System.out.println("Deer is Eating");
	}
	
	public void sleep() {
		System.out.println("Deer is Sleeping");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		Animal animal; 
		animal = new Lion();
		System.out.println("Lion Details : \n");
		animal.eat();
		animal.sleep();
	}
}
