package encapsulationPrograms;

import java.util.Scanner;

public class EmployeeSalaryManagement
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
 
		int employeeId = sc.nextInt();
		sc.nextLine();
		String employeeName = sc.nextLine();
		double salary = sc.nextDouble();
		int percentage = sc.nextInt();
		
		Employee02 obj = new Employee02();
		obj.setEmployeeId(employeeId);
		obj.setEmployeeName(employeeName);
		obj.setSalary(salary); 
		obj.increaseSalary(percentage);
 
		obj.displayDetails();
		
	}
}
class Employee02
{
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		if(salary<0)
		{
			this.salary = 0;
		}
		else
		{
			this.salary = salary;
		}
	}
	public double increaseSalary(int percentage)
	{
		if(percentage < 0 || percentage > 100)
		{
			return salary;
		}
		double increaseAmount = (salary * percentage)/100;
		salary = salary + increaseAmount;
		return salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee ID : "+getEmployeeId());
		System.out.println("Employee name : "+getEmployeeName());
		System.out.println("Employee Salary : "+getSalary());
		
	}
}
