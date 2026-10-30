package stringPracticePrograms;

import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = "madam";
		String rev = "";
		for(int i = 0; i <= str.length()-1; i++)
		{
			rev = str.charAt(i) + rev;
		}
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
}
