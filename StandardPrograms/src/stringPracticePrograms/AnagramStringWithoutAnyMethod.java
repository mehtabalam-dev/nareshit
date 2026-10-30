package stringPracticePrograms;

import java.util.Scanner;

public class AnagramStringWithoutAnyMethod
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
//		char[] arr = new char[str1.length()];
//		for(int i = 0; i <= str1.length()-1; i++)
//		{
//			arr[i] = str1.charAt(i);
//		}
//		char[] barr = new char[str2.length()]; 
//		for(int i = 0; i <= str2.length()-1; i++)
//		{
//			barr[i] = str2.charAt(i);
//		}
		if(str1.length() != str2.length())
		{
			System.out.println("Not an anagram");
			System.exit(0);
		}
		
		boolean isCharPresent = true;
		for(int i = 0; i <= str1.length()-1; i++)
		{
			char ch = str1.charAt(i);
			int count1 = 0;
			int count2 = 0;
			for(int j = 0; j <= str1.length()-1; j++)
			{
				if(str1.charAt(j) == ch)
				{
					count1++;
				}
				if(str2.charAt(j) == ch)
				{
					count2++;
				}
			}
			if(count1 != count2)
			{
				isCharPresent = false;
			}
		}
		if(isCharPresent)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
}
