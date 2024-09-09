package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	private String name;
	@Autowired
	@Qualifier("address2")
	private Address ad;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Address ad) {
		super();
		this.name = name;
		this.ad = ad;
		System.out.println("using the constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		System.out.println("setting the address");
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "\nName=" + name + "\nAddress=" + ad;
	}
	
	
}
