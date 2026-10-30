package basicOfJava;

import java.util.Scanner;

public class MaxTwoNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number one by one : ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1>n2)
		{
			System.out.println("Greater number is : " + n1);
		}
		System.out.println("Greater number is : " + n2);
	}
}
