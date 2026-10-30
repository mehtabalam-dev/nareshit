package stringPrograms;

import java.util.Scanner;

public class PrintAsciiValueString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		for(int i = 0; i <= s.length()-1; i++)
		{
			char ch = s.charAt(i);
			System.out.println(ch+" = "+(int)ch);
		}
	}
}
