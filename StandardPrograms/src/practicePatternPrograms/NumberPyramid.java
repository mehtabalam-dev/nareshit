package practicePatternPrograms;

import java.util.Scanner;

public class NumberPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		int space = input - 1;
		for(int i = 1; i<= input; i++) {
			for(int j = 1; j<= space; j++) {
				System.out.print("  ");
			}
			for(int z = 1; z<= i; z++) {
				System.out.print(z+" ");
			}
			for(int k = i - 1; k>= 1; k--) {
				System.out.print(k+" ");
			}
			space--;
	 
			System.out.println();
		}
	}

}
