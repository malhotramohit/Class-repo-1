package com.gs.corejava.inheritance;

public class Employee extends Person{
	int id;
	String name;
	// visible only to child classes
	protected int sal;
	int age;
	
	public void m1() {
		System.out.println("I am emp m1");
	}
}
