package collectionsPrograms;

import java.util.Scanner;
import java.util.Vector;

public class VectorPracticeQsn02 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Vector<Employee> v = new Vector<>();
		System.out.println("Enter number of employee : ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter employeeId, employeeName, salary : "+(i+1));
			int employeeId = Integer.parseInt(sc.nextLine());
			String employeeName = sc.nextLine();
			double basicSalary = Double.parseDouble(sc.nextLine());
			Employee obj = new Employee(employeeId,employeeName,basicSalary);
			v.add(obj);
		}
		for(Employee e : v)
		{
			e.displayDetails();
			System.out.println("-----------------------------");
		}
	}
}
class Employee
{
	public int employeeId;
	public String employeeName;
	public double basicSalary;
	
	public Employee(int employeeId,String employeeName,double basicSalary)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}
	public double calculateSalary()
	{
		double finalSalary = basicSalary + (basicSalary * 10/100);
		return finalSalary;
	}
	public void displayDetails()
	{
		System.out.println("Employee Id    : "+employeeId);
		System.out.println("Employee Name  : "+employeeName);
		System.out.println("Employee Salary: "+basicSalary);
		System.out.println("Final Salary   : "+calculateSalary());
	}
}