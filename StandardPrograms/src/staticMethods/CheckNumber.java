package staticMethods;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		System.out.println(isPositive());
	}
	public static boolean isPositive() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		boolean result = (num>0) ? true : false;
		return result;
	}

}
