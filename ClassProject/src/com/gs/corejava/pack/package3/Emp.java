package com.gs.corejava.pack.package3;

public class Emp {
	
	int id;
	String name;
	
	Emp(){
		
		//Emp(2,"comming from no args to param wala");

		//1) using this i can call cons
		this(2,"comming from no args to param wala");
		//2) using this i can call method
		this.checkMe();
		//3) using this i can acces class level var
		System.out.println(this.id);
		System.out.println("no args constructor");
	}
	
	Emp(int id,String name){
		System.out.println("param wala constr "+ id
				+" name " +name);
	}
	
	void checkMe() {
		System.out.println("inside check me");
	}
	
}
