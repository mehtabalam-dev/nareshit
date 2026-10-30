package practicePatternPrograms;

import java.util.Scanner;

public class RightTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
//		int space = 4;
//		int star = 1;
//		for(int i = 1; i<= input; i++) {
//			for(int j = 1; j<=space; j++) {
//				System.out.print("   ");
//			}
//			for(int z = 1; z<=star; z++) {
//				System.out.print(" * ");
//			}
//			space--;
//			star++;
//			System.out.println();
//		}
		
		// right triangle decreasing
		
//		for(int i = 1; i<= input;i++) {
//			for(int j = i; j<= input; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
		// right triangle increasing
//		for(int i = 1; i<= input; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
		// shortcut first quadrant
//		for(int i = 1; i<= input; i++) {
//			for(int j = 1; j<= input; j++) {
//				if(i>=j) {
//					System.out.print(" * ");
//				}
//			}
//			System.out.println();
//		}
		
		// shortcut third quadrant
//		for(int i= 1; i<= input; i++) {
//			for(int j = 1; j<= input; j++) {
//				if(i<=j) {
//					System.out.print(" * ");
//				}else {
//					System.out.print("   ");
//				}
//			}
//			System.out.println();
//		}
		
		// shortcut second quadrant
//		for(int i = 1; i<= input; i++) {
//			for(int j = input; j>= 1; j--) {
//				if(i>=j) {
//					System.out.print(" * ");
//				}else {
//					System.out.print("   ");
//				}
//			}
//			System.out.println();
//		}
		
		// shortcut fourth quadrant
//		for(int i = 1; i<= input; i++) {
//			for(int j = input; j>= 1; j--) {
//				if(i<=j) {
//					System.out.print(" * ");
//				}
//			}
//			System.out.println();
//		}
		
		
	}

}
