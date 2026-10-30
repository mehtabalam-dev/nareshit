package classAndObject;

import java.util.Scanner;

public class Qsn07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle.");
		double radius = sc.nextDouble();
		Circle obj = new Circle(radius);
		obj.displayDetails();
	}

}

class Circle{
	
	public double radius;
	
	public Circle(double radius) {
		
		this.radius = radius;
	}
	
	public double calculateArea() {
		
		double result = 3.14*(this.radius*radius);
		return result;
	}
	
	public double calculateCircumference() {
		
		double result = 2*3.14*(this.radius);
		return result;
	}
	
	public void displayDetails() {
		
		System.out.println("Circle Details: ");
		System.out.println("Radius of Circle: "+radius);
		System.out.println("Area of Circle: "+calculateArea());
		System.out.println("Circumference of circle: "+calculateCircumference());
	}
	
}
