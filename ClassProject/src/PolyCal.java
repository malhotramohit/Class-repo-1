
public class PolyCal {

	// return type is not a part of method signature
	//method signature : name , parameters
	
//	int sumOfThreeNum(int a , int b , int c) {
//		return a+b+c;
//	}
//	
//	long sumOfThreeNum(int a , int b , int c) {
//		return a+b+c;
//	}
	
	// rule 1 : method name should be same
	// rule 2: method signature should be diff
	/// rule 2.1:  no. of par/arg
	// rule 2.2 : data type of para diff
	// rule 2.3 : agee/peeche : relative reordering of parameters with diff data types.
	
	int sum(int a, int b) {
		return a+b;
	}
	
	int sum(int a, int b , int c, int d) {
		return a+b+c+d;
	}
	
	int sum(int a, int b , int c) {
		return a+b+c;
	}
	
	String sum(int a, int b , String c) {
		return a+b+c;
	}
	
	
	String sum(String c , int a, int b) {
		return c+a+b;
	}
	
	
}
