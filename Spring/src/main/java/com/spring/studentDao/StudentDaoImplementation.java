package com.spring.studentDao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.Student;

public class StudentDaoImplementation implements StudentDao {

	private JdbcTemplate jdbctemplate;

	@Override
	public int insert(Student student) {
		String query = "INSERT INTO Student(id, name, city) value (?,?,?)";
		int r = this.jdbctemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	@Override
	public int edit(Student student) {
		String query = "UPDATE Student SET CITY=? WHERE ID=?";
		int r = this.jdbctemplate.update(query, student.getCity(), student.getId());
		return r;
	}
	
	public int delete(int id) {
		String query = "DELETE FROM Student WHERE ID=?";
		int r = this.jdbctemplate.update(query, id);
		return r;
	}
	
	public Student getDetails(int id) {
		String query = "SELECT * FROM Student WHERE ID=?";
		RowMapper<Student> rowMapper=new RowMapperImplementation();
		Student student = this.jdbctemplate.queryForObject(query, rowMapper ,id);
		return student;
	}
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public List<Student> getAllStudents() {
		String query = "SELECT*FROM Student";
//		RowMapper<Student> rowMapper = new RowMapperImplementation();
		List<Student> students = this.jdbctemplate.query(query,new RowMapperImplementation());
		return students;
	}


	
}
