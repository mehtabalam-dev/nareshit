package practicePatternPrograms;

import java.util.Scanner;

public class AlphabetIncreasing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();

		
//		for(int i = 1; i <= input; i++) {
//			char ch = 'A'; // Resets to 'A' at the start of every row
//			for(int j = 1; j <= i; j++) {
//				System.out.print(ch + " ");
//				ch++; // Advances to the next character in the same row
//			}
//			System.out.println();
//		}
		
//		for(int i = 1; i<= input; i++) {
//			for(int j = 1; j<= i; j++) {
//				System.out.print((char)('A'+ j - 1)+" ");
//			}
//			System.out.println();
//		}
		
		char ch = 'A';
		for(int i = 1; i<= input; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
