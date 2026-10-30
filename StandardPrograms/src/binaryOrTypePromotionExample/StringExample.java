package binaryOrTypePromotionExample;

public class StringExample {
	public static void main(String[] args) {
		
		
		
		// 1
		System.out.println('C' + 1);

		// 2
		System.out.println('Z' - 'A');

		// 3
		System.out.println(20 + 'B');

		// 4
		System.out.println('A' * 2);

		// 5
		System.out.println(100 / 'A');

		// 6
		System.out.println('d' - 32);

		// 7
		System.out.println("Java" + 8);

		// 8
		System.out.println(8 + "Java");

		// 9
		System.out.println("Java" + 8 + 2);

		// 10
		System.out.println(8 + 2 + "Java");

		// 11
		System.out.println("Java" + (8 + 2));

		// 12
		System.out.println('A' + "BC");

		// 13
		System.out.println("ABC" + 'D');

		// 14
		System.out.println('A' + 'B' + "C");

		// 15
		System.out.println("A" + 'B' + 'C');

		// 16
		System.out.println(5 + 5 + "5" + 5);

		// 17
		System.out.println("5" + 5 + 5);

		// 18
		System.out.println((5 + 5) + "5");

		// 19
		System.out.println("Result = " + (15 % 4));

		// 20
		System.out.println("Sum = " + (10 + 'A'));

		// 21
		System.out.println("Age: " + 20 + 5);

		// 22
		System.out.println("Age: " + (20 + 5));

		// 23
		System.out.println("" + 10 + 20);

		// 24
		System.out.println(10 + 20 + "");

		// 25
		System.out.println('0' + 5);

		// 26
		System.out.println('9' - '0');

		// 27
		System.out.println("Number: " + ('A' + 1));

		// 28
		System.out.println('A' + 1 + "B");

		// 29
		System.out.println("B" + 'A' + 1);

		// 30
		System.out.println((char)('A' + 1));
		
		
		
		
		
		System.out.println(true + "");
		System.out.println(false + "Java");
//		System.out.println('A' + false); 'A' + false triggers a Compile-Time Error
//		because 'A' is a char (numeric type), and you cannot add a boolean to a number.
		System.out.println("A" + false);
		System.out.println('A' / 2);
		System.out.println('A' % 10);
		System.out.println("10" + 20 * 3);
//		System.out.println(("10" + 20) * 3); we can't do multiplication in string
		System.out.println(null + "Java");
		System.out.println("Java" + null);
		System.out.println(20 / 5 + 2 * 3);
	}

}
