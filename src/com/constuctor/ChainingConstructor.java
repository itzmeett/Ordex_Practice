//PRACTICAL-9 : Chaining Constructors
//Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.
package com.constuctor;

class Student{
	String sname;
	int sid;
	char grade;
	
	Student(){
		System.out.println("These is default constructor");
	}
	
	Student(int sid ,String sname, char grade){
		this.sid = sid;
		this.sname = sname;
		this.grade = grade;
	}
}
public class ChainingConstructor {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("----------Details of Student1----------");
		System.out.println("Id: "+s1.sid);
		System.out.println("Name: "+s1.sname);
		System.out.println("Grade: "+s1.grade);
		
		Student s2 = new Student(1012, "Meet Patel", 'A');
		System.out.println("----------Details of Student2----------");
		System.out.println("Id: "+s2.sid);
		System.out.println("Name: "+s2.sname);
		System.out.println("Grade: "+s2.grade);
	}
}
