package practicePatternPrograms;

import java.util.Scanner;

public class InvertedPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		int star = (2*input) - 1;
		int space = 0;
		for(int i = 1; i<= input; i++) {
			for(int z = 1; z<= space; z++) {
				System.out.print("   ");
			}
			for(int j = 1; j<= star; j++) {
				System.out.print(" * ");
			}
			star-=2;
			space++;
			System.out.println();
		}
	}

}
