package whileLoop;

import java.util.Scanner;

/*
 * A Strong Number is a special number whose value equals the sum of the
factorials of its individual digits. For example, 145 is a strong
number because 1! + 4! + 5! = 1 + 24 + 120 = 145.
 */


public class StrongNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp!=0)
		{
			//step-01 take ld from temp
			int ld = temp % 10;
			//step-02 find factorial of ld
			int factorial = 1;
			for(int i = ld; i >= 1; i--)
			{
				factorial *= i;
			}
			// step-03 add factorial to sum
			sum = sum + factorial;
			//step-04 remove ld from temp
			temp = temp / 10;
		}
		if(sum == num)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
}
