package com.spring.studentConfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.Student;
import com.spring.studentDao.StudentDao;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello World");
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao studentdao = context.getBean("studentDao", StudentDao.class);

		// ++++++++++++++++insert+++++++++++++++++++++
		
//		Student student = new Student();
//		student.setId(873);
//		student.setName("SuryaKumar Yadav");
//		student.setCity("Mumbai");
//		
////		studentdao.insert(student);
//		
//		int result = studentdao.insert(student);
//		System.out.println(result);
		
		// ++++++++++++++++update+++++++++++++++++++++
		
//		Student student = new Student();
//		student.setCity("Banglore");
//		student.setId(873);
//		int result = studentdao.edit(student);
//		System.out.println("Data changed : "+result);
		
		// ++++++++++++++++delete+++++++++++++++++++++
		
//		int result = studentdao.delete(144);
//		System.out.println("Data deleted : "+result);
		
		// ++++++++++++++++fetch single row data+++++++++++++++++++++
		
//		Student result = studentdao.getDetails(873);
//		System.out.println(result);
		
		// ++++++++++++++++fetch all data+++++++++++++++++++++
		
		List<Student> students = studentdao.getAllStudents();
		for(Student s : students) {
			System.out.println(s);
		}
	}
}
