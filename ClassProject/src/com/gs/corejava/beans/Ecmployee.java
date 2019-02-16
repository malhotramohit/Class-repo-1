package com.gs.corejava.beans;

public class Ecmployee {
	
	String name;
	int age;
	long salary;
	//parent attr
	int var1 = 88;
	
	public void m2() {
		System.out.println("parent m2");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}
