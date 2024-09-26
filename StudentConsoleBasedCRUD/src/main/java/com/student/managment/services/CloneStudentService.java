package com.student.managment.services;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class CloneStudentService {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void cloneData() {
		try {
			String sql = "insert into Clone_Students (name, email, mobile)"
					+ "select name, email, mobile from Student_Information";

			entityManager.createNativeQuery(sql).executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : "+ e.getMessage());
		}
		System.out.println("Data cloned successfully !!");
	}
}
