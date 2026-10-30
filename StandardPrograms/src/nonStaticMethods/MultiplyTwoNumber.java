package nonStaticMethods;

import java.util.Scanner;

public class MultiplyTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number one by one...");
		int a = sc.nextInt();
		int b = sc.nextInt();
		MultiplyTwoNumber obj = new MultiplyTwoNumber();
//		int val=obj.multiply(a, b);
//		System.out.println(val);
		
		System.out.println(obj.multiply(a, b));
	}
	public int multiply(int a, int b) {
		
		return a*b;
	}

}
