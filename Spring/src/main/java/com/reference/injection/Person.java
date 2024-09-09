package com.reference.injection;

public class Person {
	private String name;
	private Address ad;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Address ad) {
		super();
		this.name = name;
		this.ad = ad;
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
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "\nName=" + name + "\nAddress=" + ad;
	}
	
	
}
