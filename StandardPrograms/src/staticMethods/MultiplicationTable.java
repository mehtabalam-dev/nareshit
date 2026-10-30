package staticMethods;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		multiplicatioTable(num);
		
		
	}
	public static void multiplicatioTable(int num) {
		for(int i = 1; i<= 10; i++) {
			System.out.print(num*i+" ");
		}
		
		
	}

}
