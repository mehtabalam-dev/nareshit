package stringPrograms;

import java.util.Scanner;

public class ReverseWordString 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		String [] a = s.split(" ");
		String result = "";
		for(int i = 0; i <= a.length-1;i++)
		{
			//reverse a[i]	and add it to result
			String rev = "";
			for(int j = a[i].length()-1; j>=0; j--)
			{
				rev = rev + a[i].charAt(j);
			}
			result = result+rev+" ";
			if(i==a.length-1)
			{
				result = result+rev;
			}
			else
			{
				result = result+rev+" ";
			}
		}
		System.out.println(result.trim());
	}
}
