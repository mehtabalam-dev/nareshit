package basicOfJava;

import java.util.Scanner;

public class AverageThreeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers one by one :  ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		double avg = (n1 + n2 + n3)/3.0;
//		System.out.println("Average of three numbers is : " +avg);
		System.out.printf("Average of three numbers is :  %.2f ",avg);
	}

}
