package staticMethods;

import java.util.Scanner;

public class PrintSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		printSquare(num);
	}
	public static void printSquare(int num) {
		System.out.println(num*num);
	}

}
