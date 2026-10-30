package stringPrograms;

import java.util.Scanner;

public class FindDuplicateCharacter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		String result = "";
		for(int i = 0; i <= s.length()-1; i++)
		{
			char ch = s.charAt(i);
			if(!result.contains(""+ch))
			{
				result = result + ch;
			}
			else
			{
				System.out.print(ch+" ");
			}
		}
	}
}
