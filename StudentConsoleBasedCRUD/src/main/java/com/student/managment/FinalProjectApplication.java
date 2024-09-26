package com.student.managment;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.student.managment.services.StudentService;
import com.student.managment.services.CloneStudentService;

@SpringBootApplication
public class FinalProjectApplication {

	@Autowired
	private StudentService service;

	@Autowired
	private CloneStudentService cloneService;

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner run(String... arg) throws Exception {

		return args -> {
			boolean exit = false;
			try (Scanner scanner = new Scanner(System.in)) {
				while (!exit) {
					System.out.println("_________________________________________________");
					System.out.println("\n1. Get Single Student");
					System.out.println("2. Get all Students");
					System.out.println("3. Add a Student");
					System.out.println("4. Update Details");
					System.out.println("5. Delete a Student");
					System.out.println("6. Clone data into another Table");
					System.out.println("7. Exit");

					System.out.println("\nEnter Your Choice : ");
					if (!scanner.hasNextInt()) {
						System.out.println("\nInvalid input, please enter a valid integer");
						scanner.next();
						continue;
					}
					int choice = scanner.nextInt();
					scanner.nextLine();

					switch (choice) {

					case 1:
						service.displaySingleStudent(scanner);
						break;

					case 2:
						service.displayStudents();
						break;

					case 3:
						service.addStudentData(scanner);
						break;

					case 4:
						service.updatingStudentInfo(scanner);
						break;

					case 5:
						service.deleteStudent(scanner);
						break;

					case 6:
						if (cloneService != null) {
							cloneService.cloneData();
						} else {
							System.out.println("Clone Student Service is not available.");
						}
						break;
					case 7:
						exit = true;
						System.out.println("\nExiting...\nThank you for using our application");
						break;

					default:
						System.out.println("\nInvalid input, please choose betwenn 1 to 7 choice");

					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("\nError Found : " + e.getMessage());

			}
		};
	}
}
