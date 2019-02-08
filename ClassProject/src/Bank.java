
public class Bank {

	public static void main(String[] args) {
		Account accForMohit  = new Account(45345,455);
		Account accForRohit  = new Account(453453244,3434);
		Account accForAmit  = new Account(423432434,44);
		
		Account accForRahul = 
				new Account(4545435, 45);
		
		
		accForAmit.age=23;
		accForAmit.name = "Amit";
		
		
		accForRohit.age=22;
		accForRohit.name = "Rohit";

		accForMohit.age=26;
		accForMohit.name = "Mohit";
		
		
		System.out.println("Mohits acc" +accForMohit.accNum);
		
	}

}
