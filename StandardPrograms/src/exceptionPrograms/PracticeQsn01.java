package exceptionPrograms;

import java.util.Scanner;

public class PracticeQsn01 
{
	public static int age = 20;
	public static void main(String[] args)// throws InvalidAgeException
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try
		{
			AgeValidator.validate(age);
		}
		catch(InvalidAgeException e)
		{
			System.err.println("Exception: ");
//			System.out.println("Reason: "+e.getMessage());
//		    e.printStackTrace();
			System.out.println(e.toString());
		}
		
	}
}
class AgeValidator
{
	public static void validate(int age) throws InvalidAgeException
	{
		if(age < 18)
		{
			String msg = "Age must be 18 or above for voting";
			throw new InvalidAgeException(msg);
		}
		else
		{
			System.out.println("Age is valid : "+age);
		}
	}
}
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String errorMessage)
	{
		super(errorMessage);
	}
}
