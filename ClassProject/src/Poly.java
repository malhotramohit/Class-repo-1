
public class Poly {
	public static void main(String[] args) {
		String s1 = "mo";
		String s2 = "mal";
		
		System.out.println(s1+s2); // momal -- concat
		
		int a =2;
		int b = 3;
		
		System.out.println(a+b); // 5 -- sum
		
		// case 1
		//int plus string
		System.out.println(a+b+s1);
		// 5mo
		// 23mo
		
		//case 2
		System.out.println(s1+a+b+ (a*b));
		//mo23
		
		
		//method overloading
		PolyCal cal = new PolyCal();
		
		System.out.println("two sum "+cal.sum(2, 3));
		System.out.println("three sum "+cal.sum(4, 5,56));
		System.out.println("four sum "+cal.sum(34, 76, 556, 98));
		
		System.out.println("int plus string "+cal.sum(a, b,s1));
		
		System.out.println("string plus int "+cal.sum(s1,a,b));
		
		

	}
}


