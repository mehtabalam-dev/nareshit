package stringPracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b))
		{
			System.out.println("Anagram String");
		}
		else
		{
			System.out.println("Not Anagram String");
		}
		
 
	}
}
