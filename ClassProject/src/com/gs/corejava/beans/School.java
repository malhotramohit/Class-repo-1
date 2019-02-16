package com.gs.corejava.beans;

public class School {
	public static void main(String[] args) {
		
		Subject physics = new Subject();
		
		physics.setName("physics of class 11");
		
		String subName=  physics.getName();
		
		physics.setIntroducedYear(2000);
		
		int year =physics.getIntroducedYear();
		
		System.out.println("year is "+year);
		
		System.out.println(subName);
	}
}
