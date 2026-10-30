package stringPrograms;

import java.util.Scanner;

public class CountWordString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
//		int count = 0;
//		for(int i = 0; i <= s.length()-1; i++)
//		{
//			if(s.charAt(i)==' ')
//			{
//				count++;
//			}
//		}
//		System.out.println("Count of words = "+(count+1));
		String [] arr = s.split(" ");
		System.out.println("Count of words = "+arr.length);
	}
}
