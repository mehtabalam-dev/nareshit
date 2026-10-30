package staticMethods;

import java.util.Scanner;

public class DisplayMessage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name...");
		String name = sc.nextLine();
		displayMessage(name);
		
	}
	public static void displayMessage(String name) {
			 System.out.println("Hello "+name);
	}
}
