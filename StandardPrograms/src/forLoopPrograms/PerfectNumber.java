package forLoopPrograms;

import java.util.Scanner;
/*
 * A perfect number is a positive integer that equals the sum of its
proper positive divisors (excluding the number itself). For example, 6
is a perfect number because its proper divisors are 1, 2, and 3, and 1
+ 2 + 3 = 6. Other well-known perfect numbers include 28, 496, and
8128.
 */
public class PerfectNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n/2; i++)
		{
			if(n % i == 0)
			{
				sum = sum +i;
//				System.out.println(i);
			}
		}
		if(sum == n)
		{
			System.out.println("Given number is perfect number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
		System.out.println("Sum of factors is: " +sum);
	}
}
