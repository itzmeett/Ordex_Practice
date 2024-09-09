package com.spring.Spring;

public class Person {
	private int pid;
	private String mobile_no;
	private String email;
	private String name;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String mobile_no, String email, String name) {
		super();
		this.pid = pid;
		this.mobile_no = mobile_no;
		this.email = email;
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nPerson_id=" + pid + "\nName=" + name +" \nMobile_no=" + mobile_no + "\nEmail=" + email ;
	}
	
}
