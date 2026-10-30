package arrayPrograms;

import java.util.Scanner;

public class ArrayReferenceObjectEmployee 
{
	static Employee[] arr;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nnumber of employees : ");
		int size = sc.nextInt();
		arr = new Employee[size];
		sc.nextLine();
		for(int i = 0; i <= arr.length-1; i++)
		{
			System.out.println("Enter employeeId,employeeName,department,salary of employee : "+(i+1));
			String employeeName = sc.nextLine();
			int eemployeeId = sc.nextInt();
			sc.nextLine();
			String department = sc.nextLine();
			double salary = sc.nextDouble();
			arr[i] = new Employee(eemployeeId, employeeName, department, salary);
			sc.nextLine();
		}
		System.out.println("==============================================================================================");
		System.out.println("Enter 1 for printing the details of employees belongs to the given dept");
		System.out.println("Enter 2 for printing the details of employees who are having salary greater than the given salary");
		System.out.println("Enyter 3 for average salary");
		System.out.println("==============================================================================================");
		System.out.println("Enter your choice :");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1-> 
			{
				sc.nextLine();
				System.out.println("Enter the department name : ");
				String dept = sc.nextLine();
				empBelongToGivenDept(dept);
			}
			case 2->
			{
				System.out.println("Enter the target salary : ");
				double salary = sc.nextDouble();
				empGreaterThanGivenSalary(salary);
			}
			case 3->
			{
				avgSalary();
			}
			default->
			System.out.println("Enter valid input!");
		}
		
	}
	public static void empBelongToGivenDept(String dept)
	{
		for(Employee e : arr)
		{
			if(e.department.equalsIgnoreCase(dept))
			{
				e.displayDetails();
			}
		}
	}
	public static void empGreaterThanGivenSalary(double salary)
	{
		for(Employee e : arr)
		{
			if(e.salary>salary)
			{
				e.displayDetails();
			}
		}
	}
	public static void avgSalary()
	{
		double sum = 0;
		for(Employee e : arr)
		{
			sum = sum + e.salary;
		}
		System.out.println("Average Salary = "+sum/arr.length);
	}
}
class Employee
{
	public int employeeId;
	public String employeeName;
	public String department;
	public double salary;
	public Employee(int employeeId, String employeeName, String department, double salary)
	{	
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee ID   : "+employeeId);
		System.out.println("Department    : "+department);
		System.out.println("Salary        : "+salary);
	}
}
