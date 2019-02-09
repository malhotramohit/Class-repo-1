

import java.util.Scanner;

public class CalculatorNew {
	public static void main(String[] args) {

		char operator;
		int number1, number2, result;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter operator (either +, -, * or /): ");
		operator = scanner.next().charAt(0);
		System.out.print("Enter number1 and number2 respectively: ");
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		scanner.close();
		OldCalculator shivamsCal = new OldCalculator();

		switch (operator) {
		case '+':
				
			shivamsCal.sum(number1,number2);
			
			break;

		case '-':
			int res1 = shivamsCal.diff(number1,number2);
			System.out.println("diff is "+ res1);
			break;

		case '*':
			int res2 = shivamsCal.multiply(number1,number2);
			System.out.println("mul is "+ res2);
			break;

		case '%':
			int res3 = shivamsCal.mod(number1,number2);
			System.out.println("mod is "+ res3);
			break;

		default:
			System.out.println("Invalid operator!");
			break;
		}
	}
	
}


class OldCalculator {
	
	void sum(int a , int b) {
		int sum = a+b;
		//String name = "mogit";
		System.out.println("sum is "+ sum);
		
	}
	

	int diff(int a , int b) {
		int diff = a-b;
		//String name = "mogit";
		return  diff;
	}
	

	int multiply(int a , int b) {
		int mul = a*b;
		//String name = "mogit";
		return  mul;
	}
	

	int mod(int a , int b) {
		int mod = a%b;
		//String name = "mogit";
		return  mod;
	}
}