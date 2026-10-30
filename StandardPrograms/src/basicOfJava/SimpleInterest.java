package basicOfJava;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle, rate of interest and time(in years) one by one : ");
		double p = sc.nextDouble();
		double i = sc.nextDouble();
		double t = sc.nextDouble();
		
		double result = (p*i*t)/100;
		System.out.println("Simple interest is : "+ result);
	}

}
