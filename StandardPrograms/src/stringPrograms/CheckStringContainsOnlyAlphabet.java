package stringPrograms;

import java.util.Scanner;

public class CheckStringContainsOnlyAlphabet
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		boolean onlyAlphabet = true;
		for(int i = 0; i <= s.length()-1; i++)
		{
			char ch = s.charAt(i);
			if(!((ch>= 'A' && ch <= 'Z')) || (ch >= 'a' && ch <= 'z'))
			{
				onlyAlphabet = false;
				break;
			}
		}
		if(onlyAlphabet)
		{
			System.out.println("String has only alphabet");
		}
		else
		{
			System.out.println("String does not have only alphabets");
		}
	}
}
