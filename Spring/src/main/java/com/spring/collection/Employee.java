package com.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> mobile_nos;
	private Set<String> addresses;
	private Map<String, String> courses;
	public Employee() {
		super();
	}
	public Employee(String name, List<String> mobile_nos, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.mobile_nos = mobile_nos;
		this.addresses = addresses;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMobile_nos() {
		return mobile_nos;
	}
	public void setMobile_nos(List<String> mobile_nos) {
		this.mobile_nos = mobile_nos;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
}
