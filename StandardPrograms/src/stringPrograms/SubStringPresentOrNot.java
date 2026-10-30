package stringPrograms;

import java.util.Scanner;

public class SubStringPresentOrNot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		System.out.println("Enter the substring : ");
		String sub = sc.nextLine();
		if(s.contains(sub))
		{
			System.out.println("Substring");
		}
		else
		{
			System.out.println("Not substring");
		}
	}
}
