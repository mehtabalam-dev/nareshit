package staticMethods;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle.");
		int radius = sc.nextInt();
		double result = findArea(radius);
		System.out.println(result);
		
	}
	public static double findArea(int radius) {
		double area = 3.14* (radius*radius);
		return area;
	}

}
