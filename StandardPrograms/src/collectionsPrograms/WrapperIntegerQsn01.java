package collectionsPrograms;

import java.util.Scanner;

public class WrapperIntegerQsn01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = 150;
		Integer b = Integer.valueOf(a);
		String str = "250";
		int c = Integer.parseInt(str);
		int d = b.intValue();
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
