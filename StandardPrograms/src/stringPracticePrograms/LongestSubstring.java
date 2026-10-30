package stringPracticePrograms;

import java.util.Scanner;

public class LongestSubstring 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		String longestString = "";
//		for(int i = 0; i < str.length(); i++)
//		{
//			String temp = "";
//			for(int j = i; j < str.length(); j++)
//			{
//				char ch = str.charAt(j);
//				if(temp.contains(ch+""))
//				{
//					break;
//				}
//				temp = temp + ch;
//				if(temp.length() > longestString.length())
//				{
//					longestString = temp;
//				}
//			}
//		}
//		System.out.println("longest String = "+longestString);
		for(int i = 0; i < str.length(); i++)
		{
			String temp = "";
			for(int j = i; j < str.length(); j++)
			{
				String ch = str.substring(j, j+1);
				if(temp.contains(ch))
				{
					break;
				}
				temp = temp + ch;
				if(temp.length() >= longestString.length())
				{
					longestString = temp;
				}
			}
		}
		System.out.println("longest String = "+longestString);
	}
}
