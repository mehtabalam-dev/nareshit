package whileLoop;

import java.util.Scanner;

public class SpyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int prod = 1;
		
		while(num != 0)
		{
			int ld = num % 10;
			sum = sum + ld;
			prod = prod * ld;
			num = num /10;
		}
		if(sum == prod)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not a spy number");
		}
	}
}
