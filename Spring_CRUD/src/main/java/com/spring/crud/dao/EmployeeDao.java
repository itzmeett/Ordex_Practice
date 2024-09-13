package com.spring.crud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.crud.entity.Employee;

@Repository
public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	@Autowired
	EmployeeDao(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);

	}

	@Transactional
	public void saveEmployees(Employee employee) {
		this.hibernateTemplate.save(employee);
	}

	public Employee getEmployee(int id) {
		Employee emp = this.hibernateTemplate.get(Employee.class, id);
		return emp;
	}

	public List<Employee> getAllEmployees() {
		List<Employee> emp = this.hibernateTemplate.loadAll(Employee.class);
		return emp;
	}

	@Transactional
	public void deleteEmployee(int id) {
		Employee emp = this.hibernateTemplate.get(Employee.class, id);
		this.hibernateTemplate.delete(emp);
	}

	@Transactional
	public void updateEmployee(Employee employee) {
		this.hibernateTemplate.update(employee);
	}
}
