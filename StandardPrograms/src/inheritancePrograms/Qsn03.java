package inheritancePrograms;

import java.util.Scanner;

public class Qsn03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details...");
		String name = sc.nextLine();
		int id = sc.nextInt();
		double salary = sc.nextDouble();
		double bonus = sc.nextDouble();
		
		BonusEmployee obj = new BonusEmployee(name, id, salary, bonus);
		obj.displayDetails();
		System.out.println("Basic Salary: "+obj.calculateSalary());
		System.out.println("Final Salary: "+obj.calculateSalaryBonus());
	}

}
class Employee{
	public String name; 
	public int id;
	public double salary;
	
	public Employee(String name,int id,double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee Details: ");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Salary: "+salary);
	}
	
	public double calculateSalary() {
		return salary;
	}
}
class BonusEmployee extends Employee{
	public double bonus;
	
	public BonusEmployee(String name,int id,double salary,double bonus) {
		super(name,id,salary);
		this.bonus = bonus;	
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Employee Bonus: "+bonus);
	}
	
	public double calculateSalaryBonus() {
		double totalSalary = super.calculateSalary();
		return totalSalary + totalSalary* bonus/100;
	}
}
 

