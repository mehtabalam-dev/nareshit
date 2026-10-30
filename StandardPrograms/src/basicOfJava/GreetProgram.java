package basicOfJava;

import java.util.Scanner;

public class GreetProgram 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age < 25)
		{
			System.out.println("Hey Young Man ");
		} 
		
		System.out.println("Please Welcome!");
		
	}
}
