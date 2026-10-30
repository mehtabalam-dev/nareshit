package stringPrograms;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		String revString = "";
		for(int i = s.length()-1; i >= 0; i--)
		{
			revString = revString + s.charAt(i);
		}
		System.out.println("Reverse of the String : "+revString);
	}
}
