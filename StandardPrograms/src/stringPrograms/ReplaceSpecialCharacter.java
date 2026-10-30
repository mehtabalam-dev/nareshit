package stringPrograms;

import java.util.Scanner;

public class ReplaceSpecialCharacter
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
			if((ch>='A' && ch <= 'Z') || (ch>= 'a' && ch<= 'z') || (ch>='0' && ch <='9'))
			{
				result = result + ch;
			}
		}
		System.out.println(result);
	}
}
