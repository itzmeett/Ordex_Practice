//PRACTICAL-8 : 
//	Constructor Overloading
//	Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:
//
//	One constructor takes title and author as parameters.
//	The other constructor takes title, author, and price as parameters.
//	Print the values of the variables for each constructor.
package com.constuctor;

class Book{
	String author, title;
	int price;
	
	Book(){
		System.out.println("These is default constructor");
	}
	
	Book(String author, String title){
		this.author = author;
		this.title = title;
	}
	
	Book(String title, String author, int price){
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	public String toString() {
		return "Title : " + title + "\nAuthor: "+author+"\nPrice:"+price;
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println(b1 + "\n");
		
		Book b2 = new Book("Moral of Story", "Whatson david");
		System.out.println(b2 + "\n");
		
		Book b3 = new Book("Atlantice", "john william", 599);
		System.out.println(b3+ "\n");
	}
}
