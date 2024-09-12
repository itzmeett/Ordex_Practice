package com.spring.crud;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.crud.dao.EmployeeDao;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello World!");
		boolean flag = true;
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeDao employeeDao = context.getBean(EmployeeDao.class);

		/*
		 * Employee meet = new Employee(); meet.setName("Meet patel");
		 * meet.setCity("Ahmedabad");
		 * 
		 * employeeDao.saveEmployees(meet);
		 */

		while (flag) {
			System.out.println("Press 1 for add a new employee");
			System.out.println("Press 2 for get a single employee details");
			System.out.println("Press 3 for view all employee details");
			System.out.println("Press 4 for remove a employee");
			System.out.println("Press 5 for update employee details");
			System.out.println("Press 6 for exit");

			System.out.println("\nSelect Option : ");
			int input = scanner.nextInt();

			switch (input) {

			case 1:
				// Adding a employee

				break;

			case 3:
				// View all employees
				break;

			case 4:
				// Remove employee
				break;

			case 5:
				// Update employee
				break;

			case 6:
				// Exit
				flag = false;
				break;
			}
			System.out.println("Thanks for using our Application");

		}
		context.close();
	}
}
