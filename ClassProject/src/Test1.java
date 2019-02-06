
public class Test1 {
	public static void main(String[] args) {
		
		// int a= 2
		// a=3
		// int[] arr = new int[3];
		// arr[0]=2
		// arr[1]
		
		// classname  oldLamp  = new classname();
		// create object
		Lamp oldLamp = new Lamp(); // 010100
		
		Lamp newLamp = new Lamp(); // 9092990
		
		
		//Emp emp1 = new Lamp();
		
		//Emp emp1 = new Emp();
		
		// membership oper=== "." == dot op
		
		System.out.println(oldLamp.isOn);
		
		oldLamp.switchOn();
		
		System.out.println(oldLamp.isOn);
		
		System.out.println("isOn flag for new Lamp " +newLamp.isOn);
		System.out.println("id is " +newLamp.getId());
		
		Lamp.checkLamp();
		
		
		
		
		
	}
}

// class declare
class Lamp {
	
	// member variable , field
	boolean isOn = false;	
	int id = 3;
	String nameOfLamp = "MyLamp";
	
	// methods : method name, return type void , int, short , int[], Lamp, body { }
	void switchOn() {
		System.out.println("inside swicth in method");
		isOn = true;
		System.out.println("exit swicth  method");
		return ;
	}
	
	int getId() {
		return id;
	}
	
	static void checkLamp() {
		System.out.println("check lamp static method");
	}
	
	
	
}