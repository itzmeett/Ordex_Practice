//PRACTICAL-15:Write a Java program to create a class called Employee with methods called work() 
//and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a 
//new method called addEmployee().
package com.inheritance;

class Employee {
	
	private float salary;
	
	Employee(float salary){
		this.salary = salary;
	}

	public void work() {
		System.out.println("Working as an Employee");
	}

	public float getSalary() {
		return salary;
	}
}

class HRManager extends Employee {
	
	HRManager(float salary){
		super(salary);
	}
	@Override
	public void work() {
		System.out.println("Working as HR Manager");
	}
	
	public void addEmployee() {
		System.out.println("Add a new employee");
	}
}

public class OverrideMethod {
	public static void main(String[] args) {
		Employee emp1 = new Employee(4000);
		HRManager hr1 = new HRManager(2000);
		
		emp1.work();
		System.out.println("Employee Salary : "+emp1.getSalary());
		
		hr1.work();
		System.out.println("Manager Salary : "+hr1.getSalary());
		
		hr1.addEmployee();
	}
}
