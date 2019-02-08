
public class Account {

	long accNum;
	long chNum;

	String name;
	int age;

	// cons is special method which is used to initialize obj
	// when obj is created
	// Rule:
	// 1) should have same name as class name
	// 2) no return type

	// ?// no return type
	Account(long accNumParam, long chkNumParam) {
		System.out.println("inside cons going to initialize "+ accNumParam );
		accNum = accNumParam;
		chNum = chkNumParam;
 	}
	
	Account(long accNumParam) {
		System.out.println("inside cons going to initialize "+ accNumParam );
		accNum = accNumParam;
		
 	}

	//not a cons
	int Account() {
		return 0;
	}

}
