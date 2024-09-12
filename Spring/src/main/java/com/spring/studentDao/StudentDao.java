package com.spring.studentDao;

import java.util.List;

import com.spring.jdbc.Student;

public interface StudentDao {
	public int insert(Student student);
	public int edit(Student student);
	public int delete(int id);
	public Student getDetails(int id);
	public List<Student> getAllStudents();
}

