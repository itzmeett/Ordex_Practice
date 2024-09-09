package com.construction.injection;

import java.util.List;

public class Person {
	private int pid;
	private String name;
	private Certificate certi;
	private List<String> hobby;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int pid, String name, Certificate certi , List<String> hobby ) {
		super();
		this.pid = pid;
		this.name = name;
		this.certi = certi;
		this.hobby = hobby;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", certi=" + certi + ", hobby=" + hobby + "]";
	}

}
