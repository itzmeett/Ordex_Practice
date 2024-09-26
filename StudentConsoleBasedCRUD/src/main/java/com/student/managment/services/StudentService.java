package com.student.managment.services;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.managment.dto.StudentDto;
import com.student.managment.entity.StudentEntity;
import com.student.managment.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	// Save Student Data
	public StudentEntity saveStudent(StudentDto dto) {
		StudentEntity student = new StudentEntity();
		student.setName(dto.getName());
		student.setEmail(dto.getEmail());
		student.setMobile(dto.getMobile());

		return studentRepository.save(student);
	}

	// get a Single Student Data
	public StudentEntity getSingleStudent(Long fetchId) {
		Optional<StudentEntity> student = studentRepository.findById(fetchId);
		if (student.isPresent()) {
			return student.get();
		} else {
			throw new RuntimeException("Student not found with id : " + fetchId);
		}
	}

	// Get all Student's data
	public List<StudentEntity> getAllStudents() {
		return studentRepository.findAll();
	}

	// Deleting a Student
	public void deleteStudentById(Long deleteId) {
		if (studentRepository.existsById(deleteId)) {
			studentRepository.deleteById(deleteId);
			System.out.println("\nStudent with ID " + deleteId + " is successfully deleted");
		} else {
			System.out.println("No student found with id " + deleteId);
		}
	}

	// Updating a Student
	public StudentEntity updateStudent(Long id, StudentDto dto) {
		StudentEntity updateStudent = getSingleStudent(id);
		updateStudent.setName(dto.getName());
		updateStudent.setEmail(dto.getEmail());
		updateStudent.setMobile(dto.getMobile());
		return studentRepository.save(updateStudent);
	}

	// Adding a student's data
	public void addStudentData(Scanner scanner) {
		try {
			System.out.println("\n------------------Enter Student's Information------------------\n");

			System.out.println("Name :");
			String name = scanner.nextLine();

			System.out.println("Email :");
			String email = scanner.nextLine();

			System.out.println("Mobile Number :");
			String mobile = scanner.nextLine();

			StudentDto studentDto = new StudentDto();
			studentDto.setName(name);
			studentDto.setEmail(email);
			studentDto.setMobile(mobile);

			StudentEntity saveStudent = saveStudent(studentDto);
			System.out.println("\n" + saveStudent.getName() + " is added Successfully !!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Display SIngle Student's Data
	public StudentEntity displaySingleStudent(Scanner scanner) {
		Long fetchId;
		try {
			System.out.println("\nEnter Id :");
			fetchId = scanner.nextLong();

			StudentEntity student = getSingleStudent(fetchId);
			System.out.println("\n------------Details of " + student.getName() + "------------");
			System.out.println("_________________________________________________");
			System.out.println("Id : " + student.getSid());
			System.out.println("Name : " + student.getName());
			System.out.println("Email : " + student.getEmail());
			System.out.println("Mobile No : " + student.getMobile());
			return student;

		} catch (Exception e) {
			e.getMessage();
			System.out.println("\nId does not exist.");
		}
		return null;
	}

	// Display all students data
	public void displayStudents() {
		List<StudentEntity> allStudents = getAllStudents();
		System.out.println("\n------------All Students------------");
		for (StudentEntity s : allStudents) {
			System.out.println("_________________________________________________");
			System.out.println("Id : " + s.getSid());
			System.out.println("Name : " + s.getName());
			System.out.println("Email : " + s.getEmail());
			System.out.println("Mobile No : " + s.getMobile());
		}
	}

	// Delete student using student id
	public void deleteStudent(Scanner scanner) {
		try {
			System.out.println("\nEnter Id : ");
			Long deleteId = scanner.nextLong();
			scanner.nextLine();

			deleteStudentById(deleteId);
		} catch (Exception e) {
			System.out.println("Error while deleting a Student : " + e.getMessage());
		}

	}

 void updatingStudentInfo(Scanner scanner) {
		try {
			System.out.println("\nEnter Student valid Id to update details: ");
			Long updateId = scanner.nextLong();
			scanner.nextLine();

			StudentEntity updateStudent = getSingleStudent(updateId);

			boolean flag = true;
			StudentDto updateDto = new StudentDto();
			updateDto.setName(updateStudent.getName());
			updateDto.setEmail(updateStudent.getEmail());
			updateDto.setMobile(updateStudent.getMobile());

			while (flag) {
				System.out.println("\n1. Edit Name ");
				System.out.println("2. Edit Email ");
				System.out.println("3. Edit Mobile ");
				System.out.println("4. Back to the main Menu");

				System.out.println("\nEnter Choice :");
				int choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1:
					System.out.println("\nCurrent Name : " + updateStudent.getName());
					System.out.println("\nEnter Updated Name : ");
					String uname = scanner.nextLine();
					updateDto.setName(uname);
					break;
				case 2:
					System.out.println("\nCurrent Email : " + updateStudent.getEmail());
					System.out.println("\nEnter Updated Email : ");
					String uemail = scanner.nextLine();
					updateDto.setEmail(uemail);
					break;
				case 3:
					System.out.println("\nCurrent Mobile No : " + updateStudent.getMobile());
					System.out.println("\nEnter Updated Mobile number : ");
					String umobile = scanner.nextLine();
					updateDto.setMobile(umobile);
					break;
				case 4:
					updateStudent(updateId, updateDto);
					System.out.println("\nExiting... going to the main Menu");
					flag = false;
					break;
				default:
					System.out.println("\nEnter a valid choice between 1 to 4");
					break;
				}

				System.out.println("\nStudent information updated successfully");
			}
		} catch (Exception e) {
			System.out.println("Error while updating data: " + e.getMessage());
		}
	}

}
