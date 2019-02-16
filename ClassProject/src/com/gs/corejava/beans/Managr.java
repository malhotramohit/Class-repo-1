package com.gs.corejava.beans;

public class Managr extends Ecmployee {
	
	int teamSize;
	int var1 =8;
	
	public void m1() {
		// from parent
		int var1=888;
		System.out.println("local "+var1);
		System.out.println("global child mem "+this.var1);
		System.out.println("global imm parent mem "+super.var1);
		
		super.m2();
	}

	public void m2() {
		System.out.println("child m2");
	}
}
