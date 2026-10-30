package stringPrograms;

import java.util.Scanner;

public class ToggleCaseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		s = s.toUpperCase();
		String [] a = s.split(" ");
		String result = "";
		for(int i = 0; i <= a.length-1; i++)
		{
			result = result + ((char)(a[i].charAt(0)+32)+a[i].substring(1)+" ");
		}
		System.out.println(result);
	}
}
