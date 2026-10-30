package classAndObject;

import java.util.Scanner;

public class Qsn04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name and basicSalary of employees...");
		String name = sc.nextLine();
		double basicSalary = sc.nextDouble();
		Employee emp = new Employee(name, basicSalary);
		emp.displaySalaryDetails();
	}

}
class Employee{
	public String name;
	public double basicSalary;
	
	public Employee(String name,double basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public double calculateHRA() {
		double salary =  (this.basicSalary * 10/100);
		return salary;
	}
	
	public double calculateDA() {
		double da = (this.basicSalary * 20/100);
		return da;
	}
	
	public double totalSalary() {
		double total = this.basicSalary + calculateHRA() + calculateDA();
		return total;
	}
	
	public void displaySalaryDetails() {
		System.out.println("Name : "+name);
		System.out.println("Basic Salary : "+basicSalary);
		System.out.println("HRA : "+calculateHRA());
		System.out.println("DA : "+calculateDA());
		System.out.println("Total : "+totalSalary());
	}
}
