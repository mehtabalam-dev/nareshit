package forLoopPrograms;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean isNPrime = true;
		
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				isNPrime = false;
				break;
			}
		}
		if(isNPrime && n>1)
		{
			System.out.println("Prime number");
		}
		else if(n<1)
		{
			System.out.println("Prime number is not exist for negative number, Please enter a positive number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}
