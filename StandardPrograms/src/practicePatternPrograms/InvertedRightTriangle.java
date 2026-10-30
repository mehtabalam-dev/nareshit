package practicePatternPrograms;

import java.util.Scanner;

public class InvertedRightTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		int star = input;
		int space = 0;
		for(int i = 1; i<= input; i++) {
			for(int z = 1; z<=space; z++) {
				System.out.print("   ");
			}
			for(int j = 1; j<= star; j++) {
				System.out.print(" * ");
			}
			star--;
			space++;
			System.out.println();
		}
	}

}
