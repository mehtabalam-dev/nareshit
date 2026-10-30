package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String : ");
		String s1 = sc.nextLine();
		System.out.println("Enter second String : ");
		String s2 = sc.nextLine();
		char [] a = s1.toCharArray();
		char [] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
		
	}
}
