package com.spring.lifecycle;

public class Engine {
	private int engine_id;
	private String engineFromCar;
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(int engine_id, String engineFromCar) {
		super();
		this.engine_id = engine_id;
		this.engineFromCar = engineFromCar;
		System.out.println("Engine On");
	}
	@Override
	public String toString() {
		return "\nEngine_id=" + engine_id + "\nEngineFromCar=" + engineFromCar;
	}
	
	public void init() {
		System.out.println("Engine Working");
	}
	
	public void destroy() {
		System.out.println("Engine Stop");
	}
}
