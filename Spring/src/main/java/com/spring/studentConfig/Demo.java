package com.spring.studentConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.Student;
import com.spring.studentDao.StudentDao;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello World");
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao studentdao = context.getBean("studentDao", StudentDao.class); 
		
		Student student = new Student();
		student.setId(873);
		student.setName("SuryaKumar Yadav");
		student.setCity("Mumbai");
		
//		studentdao.insert(student);
		
		int result = studentdao.insert(student);
		System.out.println(result);
	}
}



