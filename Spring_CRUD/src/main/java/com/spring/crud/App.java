package com.spring.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.crud.dao.EmployeeDao;
import com.spring.crud.entity.Employee;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		int input;
		String name, city;
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
			try {
				System.out.println("\nSelect Option : ");
				input = scanner.nextInt();

				if (input == 1) {
					Employee newEmp = new Employee();
					// Adding a employee
					System.out.println("\nEnter Employee Name : ");
					name = scanner.nextLine();

					System.out.println("\nEntey City :");
					city = scanner.nextLine();

					newEmp.setName(name);
					newEmp.setCity(city);

					employeeDao.saveEmployees(newEmp);
					System.out.println("\nEmpployee " + name + " is added successfully\n");
				} else if (input == 2) {

					// view one employee data
					System.out.println("\nEnter id to get employee data : ");
					int emp_id = scanner.nextInt();

					Employee emp = employeeDao.getEmployee(emp_id);
					System.out.println("\nName : " + emp.getName() + "\nCity : " + emp.getCity() + "\n");
				} else if (input == 3) {

					// View all employees
					List<Employee> allEmps = employeeDao.getAllEmployees();
					for (Employee e : allEmps) {
						System.out.println("\nId : " + e.getId() + "\nName : " + e.getName() + "\nCity : " + e.getCity()
								+ "\n________________________");
					}

				} else if (input == 4) {

					// Remove employee
					System.out.println("\nEnter id to delete employee data : ");
					int deleteId = scanner.nextInt();
					if (deleteId != 0) {
						employeeDao.deleteEmployee(deleteId);
					} else {
						System.out.println("Id " + deleteId + "does not exist");
					}
				} else if (input == 5) {

					// Update employee
					System.out.println("\nEnter id to update employee data");
					int updateId = scanner.nextInt();

					Employee updateEmp = employeeDao.getEmployee(updateId);
					System.out.println("Enter Updated Name : ");
					String uName = scanner.nextLine();
					
					System.out.println("Enter Updated City : ");
					String uCity = scanner.nextLine();
					
					updateEmp.setName(uName);
					updateEmp.setCity(uCity);
					
					employeeDao.updateEmployee(updateEmp);
					
					/*
					 * if (updateId != 0) {
					 * System.out.println("\nPress N for edit name & press C for edit city"); char
					 * edit = scanner.next().charAt(0); if (edit == 'N' || edit == 'n') {
					 * System.out.println("Enter updated Name : "); String uName =
					 * scanner.nextLine(); updateEmp.setName(uName);
					 * 
					 * } else if (edit == 'c' || edit == 'C') {
					 * System.out.println("Enter updated City : "); String uCity =
					 * scanner.nextLine(); updateEmp.setCity(uCity); } } else {
					 * System.out.println("Id" + updateId + "not found !!!"); }
					 */
				} else if (input == 6) {

					// Exit
					flag = false;
				} else {
					System.out.println(
							"\n-----------------Please Press right option between 1 to 6 number-----------------");
				}
			} catch (Exception e) {
				System.out.println("Maybe you chhose the wrong input");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		System.out.println("\nThanks for using our Application");
		context.close();
		scanner.close();
	}
}
