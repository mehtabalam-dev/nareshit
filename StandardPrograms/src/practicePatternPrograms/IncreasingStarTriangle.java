package practicePatternPrograms;

import java.util.Scanner;

public class IncreasingStarTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
//		for(int i = 1; i<= input; i++) {
//			for(int j = 1; j<= i; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i<= input; i++) {
			for(int j = i; j<= input; j++) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
	}
}
