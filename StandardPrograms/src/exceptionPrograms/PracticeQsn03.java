package exceptionPrograms;

import java.util.Scanner;

public class PracticeQsn03 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Exception Practice Qsn");
		try
		{
			int answer = DivideByZeroException.divide(10, 0);
			System.out.println(answer);
		}
		catch(DivideByZeroException e)
		{
			System.err.println("Exception");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		}
	}
}
class DivideByZeroException extends Exception
{
	public DivideByZeroException(String description)
	{
		super(description);
	}
	public static int divide(int a, int b) throws DivideByZeroException
	{
		if(b == 0)
		{
			throw new DivideByZeroException("Cannot divide by zero");
		}
		else
		{
			return a/b;
		}
	}
}
