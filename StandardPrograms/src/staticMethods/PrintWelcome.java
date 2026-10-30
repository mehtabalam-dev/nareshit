package staticMethods;

import java.util.Scanner;

public class PrintWelcome {
	public static void main(String[] args) {
		printmessage();
	}
	public static void printmessage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a message...");
		String message = sc.nextLine();
		System.out.println(message);
	}

}
