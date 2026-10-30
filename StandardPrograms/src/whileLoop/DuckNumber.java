package whileLoop;

import java.util.Scanner;
/*
 * A duck number is a positive number that contains at least one zero,
but does not start with a zero. Examples include 3210, 70709, and 102.
Numbers like 035 or 02364 are not duck numbers because they start with
zero.
 */
public class DuckNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nunber: ");
		int num = sc.nextInt();
		int prod = 1;
		while(num!=0)
		{
			prod = prod*(num %10);
			num = num / 10;
		}
		if(prod == 0)
		{
			System.out.println("Duck Number");
		}
		else
		{
			System.out.println("Not a duck number");
		}
	}
}
