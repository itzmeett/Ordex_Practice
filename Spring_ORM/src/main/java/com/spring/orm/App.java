package com.spring.orm;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	 AnnotationConfigApplicationContext context =
                 new AnnotationConfigApplicationContext(AppConfig.class);

         StudentDao studentDao= context.getBean(StudentDao.class);

         Student student = new Student();
         student.setName("Harsh Chaudhary");
         student.setCity("Puna");
         studentDao.saveStudents(student);

         List<Student> result = studentDao.getStudents();
         for(Student s : result) {
        	 System.out.println(s);
         }
         
         context.close();
    }
}
