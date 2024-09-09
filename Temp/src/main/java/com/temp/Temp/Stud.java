package com.temp.Temp;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Stud {
	
	private String name;
	private String city;
	
	private List<String> add;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAdd() {
		return add;
	}

	public void setAdd(List<String> add) {
		this.add = add;
	}

	public Stud(String name, String city, List<String> add) {
		super();
		this.name = name;
		this.city = city;
		this.add = add;
	}

	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Stud [name=" + name + ", city=" + city + ", add=" + add + "]";
	}
	
}
