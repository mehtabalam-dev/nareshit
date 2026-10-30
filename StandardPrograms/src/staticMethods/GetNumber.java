package staticMethods;

import java.util.Scanner;

public class GetNumber {
	public static void main(String[] args) {
		System.out.println(getNumber());
	}
	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		return num;
	}

}
