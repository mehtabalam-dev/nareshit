package basicOfJava;

import java.util.Scanner;

public class VotingEligiblity 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		
//		System.out.println("Enter your age : ");
		
//		int age = sc.nextInt();
//		
//		if(age>18)
//		{
//			System.out.println("You are eligible for vote!!!");
//		}else
//		{
//			System.out.println("You are not eligible for vote...");
//		}
		
		if(age>=18)
		{
			System.out.println("You are eligible for voting");
			return;
		}
		System.out.println("You are not eligible for voting");
	}
}
