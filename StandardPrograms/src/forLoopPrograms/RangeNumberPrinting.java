package forLoopPrograms;

import java.util.Scanner;

public class RangeNumberPrinting 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number one by one: ");
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		for(int i = min; i <= max; i++)
		{
			System.out.println(i);
		}
	}
}
