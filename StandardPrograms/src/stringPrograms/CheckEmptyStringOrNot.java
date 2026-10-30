package stringPrograms;

import java.util.Scanner;

public class CheckEmptyStringOrNot 
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		if(s.isEmpty())
		{
			System.out.println("String is empty");
		}
		else
		{
			System.out.println("String is not empty");
		}
	}
}
