package staticMethods;

import java.util.Scanner;

public class AddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number one by one...");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = addNumbers(a, b);
		System.out.println(result);
	}
	public static int addNumbers(int a,int b) {
		return a+b;
	}

}
