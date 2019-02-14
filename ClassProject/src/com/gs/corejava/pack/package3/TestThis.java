package com.gs.corejava.pack.package3;
//this -- refers current refernece
public class TestThis {
	//int var1=5;class level
	int var =5;
	int var1 =15;
	
	void method(TestThis test) {
		int var =10;
		System.out.println("var inside is m1 "+var);
		System.out.println("var outside is m1 "+ var1);
	}
	
	void method1() {
		//issuee var was hiding class level var
		// to avoid we need an object/ref variable of this class or
		// using this keyword-- current object
		int var =20;
		System.out.println("var inside is m1 "+var);
		System.out.println("var outside is m1 "+ this.var);
		System.out.println("var1 outside is m1 "+ var1);
	}
	
	void method3() {
		int var =20;
		System.out.println("var inside is m2 "+var);
	}
}
