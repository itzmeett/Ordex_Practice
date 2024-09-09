package com.construction.injection;

public class Addition {
	private int n1, n2;

	public Addition(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		System.out.println("int, int");
	}
	
	public Addition(double n1, double n2) {
		super();
		this.n1 = (int) n1;
		this.n2 = (int) n2;
		System.out.println("double, double");
	}
	
	public void doSum() {
		System.out.println("Sum of "+n1+" + "+n2+ " = " + (this.n1+this.n2));
	}

	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
