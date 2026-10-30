package practicePatternPrograms;

import java.util.Scanner;

public class RightAlignedNumberTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		int space = input - 1;
		for(int i = 1; i<=input; i++) {
			for(int j = 1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<=i;j++) {
				System.out.print(i+" ");
 
			}
			space--;
			System.out.println();
			
			
		}
		
//		for(int i = 1; i<= input; i++) {
//			int number = 1;
//			for(int j = 1; j<=i;j++) {
//				System.out.print(number+" ");
//				number++;
//			}
//			System.out.println();
//		}
		
//		for(int i = 1; i<= input; i++) {
//			int number = 1;
//			for(int j = i; j<=input; j++) {
//				System.out.print(number+" ");
//				number++;
//			}
//			System.out.println();
//		}
	}

}
