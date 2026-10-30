package exceptionPrograms;

import java.util.Scanner;

public class PracticeQsn02 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strong password: ");
		String password = sc.nextLine();
		try 
		{
			PasswordChecker.checkPassword(password);	
			WeakPasswordException ps = new WeakPasswordException();
			ps.printAge();
			System.out.println(ps.age);
		}
		catch(WeakPasswordException e)
		{
			System.err.println("Exception: ");
			System.out.println("Reason "+e.getMessage());
		}
	}
}
class PasswordChecker 
{
	public static void checkPassword(String password) throws WeakPasswordException
	{
		int count = 0;
		for(int i = 0; i < password.length(); i++)
		{
			char ch = password.charAt(i);
			if(ch>='0' && ch<='9')
			{
				count++;	
			}
		}
		
		if(password.length() < 8 || count == 0)
		{
			throw new WeakPasswordException("Password is to weak");
		}
		else
		{
			System.out.println("Password is accepted..!!: ");
		}
	}
}
class WeakPasswordException extends Exception
{
	int age = 10;
	public WeakPasswordException(String errorMessage)
	{
		super(errorMessage);
	}
	
	public WeakPasswordException()
	{
		
	}
	
	public void printAge()
	{
		System.out.println("AGe: "+age);
	}
}
