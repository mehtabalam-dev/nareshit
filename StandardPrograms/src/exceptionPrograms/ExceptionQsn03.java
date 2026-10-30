package exceptionPrograms;

import java.util.Scanner;

public class ExceptionQsn03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details: ");
		int employeeId = sc.nextInt();
		sc.nextLine();
		String employeeName = sc.nextLine();
		String password = sc.nextLine();
		Employee obj = new Employee(employeeId, employeeName, password);
		try
		{
			obj.registerEmployee(password);
			System.out.println("Employee registration successful.");
		}
		catch(InvalidPasswordException e)
		{
			System.err.println(e.getMessage());
		}
	}
}
class Employee
{
	private int employeeId;
	private String employeeName;
	private String password;
	
	public Employee(int employeeId, String employeeName, String password)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.password = password;
	}
	public void registerEmployee(String password) throws InvalidPasswordException
	{
		if(password.length() < 8)
		{
			throw new InvalidPasswordException("Password must contain at least 8\r\n"
					+ "characters.");
		}
		boolean uppercase = false;
		boolean digit = false;
		for(int i = 0; i < password.length(); i++)
		{
			char ch = password.charAt(i);
			if(Character.isUpperCase(ch))
			{
				uppercase = true;
			}
			else if(Character.isDigit(ch))
			{
				digit = true;
			}
		}
		if(!uppercase)
		{
			throw new InvalidPasswordException("Password must contain an\r\n"
					+ "uppercase letter.");
		}
		if(!digit)
		{
			throw new InvalidPasswordException("Password must contain a digit.");
		}
	}
}
class InvalidPasswordException extends Exception
{
	public InvalidPasswordException(String errorMessage)
	{
		super(errorMessage);
	}
}
