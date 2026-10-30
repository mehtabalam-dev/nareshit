package stringPrograms;

import java.util.Scanner;

public class CheckStringEqualOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String : ");
		String s1 = sc.nextLine();
		System.out.println("Enter second String : ");
		String s2 = sc.nextLine();
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}
		
	}
}
