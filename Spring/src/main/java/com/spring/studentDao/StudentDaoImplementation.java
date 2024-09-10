package com.spring.studentDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Student;

public class StudentDaoImplementation implements StudentDao {

	private JdbcTemplate jdbctemplate;

	@Override
	public int insert(Student student) {
		String query = "INSERT INTO Student(id, name, city) value (?,?,?);";
		int r = this.jdbctemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
}
