package stringPrograms;

import java.util.Scanner;

public class RemoveSpaceString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		String result = "";
		for(int i = 0; i <= s.length()-1; i++)
		{
			if(s.charAt(i)!=' ')
			{
				result += s.charAt(i);
			}
		}
		System.out.println(result);
	}
}
