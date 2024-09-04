//PRACTICAL-10
package com.constuctor;

class Information{
	String schoolName;
	String[] students;
	Information(String schoolName, String[] students){
		this.schoolName = schoolName;
		this.students = students;
	}
	
	public void student_info() {
		System.out.println("School Name : "+ schoolName);
		for(String str : students) {
			System.out.println(str);
		}
	}
}

public class ConstructorWithArray {
	public static void main(String[] args) {
		String[] students = {"Meet", "Rohan", "Harsh", "Manan", "Poojan"};
		Information inf1 = new Information("K.G. Dholakiya School", students);
		
		inf1.student_info();
	}
}
