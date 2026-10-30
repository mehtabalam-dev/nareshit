package forLoopPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want series");
		int number = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		for(int i = 1; i<= number; i++) {
			System.out.print(sum+" ");
			a = b;
			b = sum; 
			sum = a + b;
		}
	}

}
