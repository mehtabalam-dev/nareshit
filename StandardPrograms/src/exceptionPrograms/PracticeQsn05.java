package exceptionPrograms;

import java.util.Scanner;

public class PracticeQsn05 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		try
		{
			LoginService.login(username);
		}
		catch(InvalidUserNameException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class LoginService
{
	public static void login(String username) throws InvalidUserNameException
	{
		if(username == null || username.trim().isEmpty())
		{
			throw new InvalidUserNameException("Username cannot be null or empty");
		}
		else
		{
			System.out.println("Welcome, "+username);
		}
	}
}
class InvalidUserNameException extends Exception
{
	public InvalidUserNameException(String errrorMessage)
	{
		super(errrorMessage);
	}
}
