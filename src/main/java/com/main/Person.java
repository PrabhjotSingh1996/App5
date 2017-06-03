package com.main;

public class Person {

	private int roll;
	private String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public Person() {
		super();
	}
	
}
