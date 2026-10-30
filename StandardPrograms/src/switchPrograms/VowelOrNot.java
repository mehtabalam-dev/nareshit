package switchPrograms;

import java.util.Scanner;

public class VowelOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charcter: ");
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a','e','i','o','u','A','E','I','O','U' -> System.out.println("Vowel");
			default -> System.out.println("Not a vowel");
		}
	}
}
