package stringPrograms;

import java.util.Scanner;

public class NumberCharacterString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		int count = 0;
		for(int i = 0; i <= s.length()-1; i++)
		{
			count++;
		}
		System.out.println(count);
//		System.out.println("Number of characters in given string is : "+s.length());
	}
}
