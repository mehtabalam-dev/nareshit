package practicePatternPrograms;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		int space = input - 1;
		int star = 1;
		for(int i = 1; i<= input; i++) {
			for(int j = 1; j<= space; j++) {
				System.out.print("   ");
			}
			for(int z = 1; z<= star; z++) {
				System.out.print(" * ");
			}
			space--;
			star+=2;
			System.out.println();
		}
	}

}
