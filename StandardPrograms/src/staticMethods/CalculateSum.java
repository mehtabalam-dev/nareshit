package staticMethods;

import java.util.Scanner;

public class CalculateSum {
	public static void main(String[] args) {
		System.out.println(calculateSum());
	}
	public static int calculateSum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number one by one...");
		int a = sc.nextInt();
		int b = sc.nextInt();
		return a+b;
	}

}
