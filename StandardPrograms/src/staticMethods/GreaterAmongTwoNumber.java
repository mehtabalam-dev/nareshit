package staticMethods;

import java.util.Scanner;

public class GreaterAmongTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number one by one...");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = checkGreater(a, b);
		System.out.println(result);
		
	}
	public static int checkGreater(int a, int b) {
		int greaterNumber = (a>b)? a :b;
		return greaterNumber;
	}

}
