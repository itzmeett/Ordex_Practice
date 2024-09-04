//PRACTICAL-16 : Write a Java program to create a class known as Person with methods called 
//getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named 
//getEmployeeId() and overrides the getLastName() method to include the employee's job title.
package com.inheritance;

class Person{
	private String fname;
	private String lname;
	
	Person(String fname, String lname){
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFirstName() {
		return fname;
	}
	
	public String getLastName() {
		return lname;
	}
}

class Employees extends Person{
	private int eid;
	private String jtitle;
	Employees(String fname, String lname, int eid, String jtitle){
		super(fname, lname);
		this.eid = eid;
		this.jtitle = jtitle;
	}
	
	public String getLastName() {
		return super.getLastName() + ", Job title : " + jtitle;
	}
	
	public int getEmployeeID() {
		return eid;
	}
}

public class OverridePerson {
	public static void main(String[] args) {
		Employees e1 = new Employees("Meet", "Patel", 2432, "Java Backend");
		System.out.println("Name : "+e1.getFirstName() + " "+e1.getLastName()+ "\nEmployee Id : "+ e1.getEmployeeID());
	}
}
