package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		sc.nextLine();
		String [] str = new String[size];
		System.out.println("Enter array elements one by one : ");
		for(int i = 0; i <= str.length-1; i++)
		{
			str[i] = sc.nextLine();
		}
		for(int cycle = 1; cycle <= str.length-1; cycle++)
		{
			for(int i = 0; i <= str.length-2;i++)
			{
				if(str[i].compareTo(str[i+1])>0)
				{
					String temp = str[i];
					str[i] = str[i+1];
					str[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
}
