package basicOfJava;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle : ");
		double length = sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle :");
		double breadth = sc.nextDouble();
		
		double area = length * breadth;
		System.out.println("Area of Rectangle is : " +area);
	}

}
