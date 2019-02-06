import java.util.Scanner;

public class TestMethods {
	public static void main(String[] args) {
		
		
		//way 1 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		
		int num= sc.nextInt();
		
		// static methods then no need to create objects
		//Calculator.calculateSquare(num);
		
		CalculatorInside myCal = new CalculatorInside(); // Cal@43434
		
		 myCal = new CalculatorInside(); // Cal@5654646
		 
		int square = myCal.calculateSquare(num);
		
		System.out.println("Square of num is "+square);
		
		System.out.println("Enter the two nums");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = myCal.calculateSum(a, b);
		System.out.println("sum is " + sum);
		
	}
}


class CalculatorInside{
	
	// return type , method name and body
	// method parameters,, method arguments,, scope : num is local variable
	 int calculateSquare(int num) {
		int result = num*num;
		return result;
	}
	 int calculateSum(int a, int b) {
			int result = a+b;
			return result;
		}
	
	
}
