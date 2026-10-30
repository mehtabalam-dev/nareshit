package staticMethods;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		displayEvenNumbers();
	}
	public static void displayEvenNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		for(int i = 1; i<= num; i++) {
			if(i%2==0) {
				System.out.println(i);
			}else {
				System.out.println("No output");
			}
		}
	}

}
