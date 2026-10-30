package classAndObject;

import java.util.Scanner;

public class Qsn06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth one by one...");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		Rectangle obj = new Rectangle(length, breadth);
//		obj.calculateArea();
//		obj.calculatePerimeter();
		obj.displayDetails();
	}
	

}
class Rectangle{
	public double length;
	public double breadth;
 
	
	public Rectangle(double length,double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	
	
	public double calculateArea() {
		
		double area = this.length * this.breadth;
		return area;
		
	}
	
	public double calculatePerimeter() {
		
		double perimeter = 2*(this.length + this.breadth);
		return perimeter;
	}
	
	public void displayDetails() {
		
		System.out.println("Rectangle Details: ");
		System.out.println("Length of Rectangle: "+length);
		System.out.println("Breadth of Rectangle: "+breadth);
		System.out.println("Area of Rectangle: "+calculateArea());
		System.out.println("Perimeter of Rectangle: "+calculatePerimeter());
	}
}
