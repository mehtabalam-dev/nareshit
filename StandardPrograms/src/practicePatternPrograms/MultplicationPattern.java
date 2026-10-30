package practicePatternPrograms;

import java.util.Scanner;

public class MultplicationPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		for(int i = 1; i<= input; i++) {
			for(int j = 1; j<= input; j++) {
				System.out.print(j*i+" ");
			}
			System.out.println();
		}
	}

}
