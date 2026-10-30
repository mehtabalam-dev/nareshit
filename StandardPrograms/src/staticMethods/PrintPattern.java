package staticMethods;

import java.util.Scanner;

public class PrintPattern {
	public static void main(String[] args) {
		printStars();
	}
	public static void printStars() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of stars you wants to print...");
		int star = sc.nextInt();
		for(int i = 1; i<= star; i++) {
			System.out.print(" * ");
		}
	}

}
