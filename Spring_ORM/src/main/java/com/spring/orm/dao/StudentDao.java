package com.spring.orm.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void saveStudents(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	@Transactional(readOnly = true)
	public List<Student> getStudents() {
		return sessionFactory.getCurrentSession().createQuery("from Student", Student.class).list();
	}
}
