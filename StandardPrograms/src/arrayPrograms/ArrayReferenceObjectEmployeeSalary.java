package arrayPrograms;

import java.util.Scanner;

public class ArrayReferenceObjectEmployeeSalary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int num = sc.nextInt();
		
		EmployeeSalary[] empArr = new EmployeeSalary[num];
		for(int i = 0; i < num; i++)
		{
			int employeeId = sc.nextInt();
			sc.nextLine();
			String employeeName = sc.nextLine();
			double salary = sc.nextDouble();
			empArr[i] = new EmployeeSalary(employeeId, employeeName, salary);
		}
		System.out.println("All Employees:");
		double maxSal = 0;
		int index = 0;
		for(int i = 0; i < empArr.length; i++)
		{
			empArr[i].printDetails();
			if(empArr[i].salary > maxSal)
			{
				maxSal = empArr[i].salary;
				index = i;
			}
		}
		System.out.println();
		System.out.println("Highest paid Employee");
		empArr[index].printDetails();
	}
}
class EmployeeSalary
{
	public int emplyeeId;
	public String employeeName;
	public double salary;
	public EmployeeSalary(int employeeId,String employeeName,double salary)
	{
		this.emplyeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public void printDetails()
	{
		System.out.println(emplyeeId + " "+ employeeName + " "+ salary);
	}
	
}