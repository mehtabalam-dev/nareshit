package practicePatternPrograms;

import java.util.Scanner;

public class NumberTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		int a = 1;
		for(int i = 1; i<= input; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(j+" ");
				a++;
			}
			System.out.println();
		}
	}

}
