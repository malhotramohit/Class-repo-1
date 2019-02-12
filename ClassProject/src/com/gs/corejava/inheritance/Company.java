package com.gs.corejava.inheritance;

public class Company {
	public static void main(String[] args) {
		
		Person per1 = new Person();
		per1.height="23";
		per1.weight="45";
		
		
		//parnet
		Employee emp = new Employee();
		emp.age=23;
		emp.id= 1;
		emp.name ="abc";
		emp.sal=90;
		emp.weight="34";
		
		//child 1
		Manager
		manager = new Manager();
		manager.age=4;
		manager.id=3;
		manager.name = "man";
		// which is not in employee class
		manager.teamSize =90;
		
		//child 2
		HRExce hr = new HRExce();
		hr.age=34;
		hr.name ="hr name";
		hr.numberOFEmpHired = 90;
		
		
	}
}
