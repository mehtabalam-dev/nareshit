package forLoopPrograms;

import java.util.Scanner;

public class FactorialOfGivenNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i = n; i>=1; i--)
		{
			if(n % i == 0) 
			{
				factorial *= i;
			}
			
		}
		System.out.println(factorial);
		
	}
}
