package stringPrograms;

import java.util.Scanner;

public class FirstNonRepeatedCharacter 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		boolean found = false;
		for(int i = 0; i <= s.length()-1; i++)
		{
			char ch = s.charAt(i);
			int count = 0;
			for(int j = 0; j <= s.length()-1; j++)
			{
				if(s.charAt(j) == ch)
				{
					count++;
				}
			}
			if(count == 1)
			{
				System.out.println("First Non-Repeated Character = "+ch);
				found = true;
				break;
			}
		}
		if(found==false)
		{
			System.out.println("No Non-Repeated Character");
		}
	}
}
