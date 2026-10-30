package arrayPrograms;

import java.util.Scanner;

public class ElementPresentOrNotLinearSearch
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter array elements one by onen: ");
		for(int i = 0; i<=a.length-1;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter element to search : ");
		int target = sc.nextInt();
		boolean found = false;
		for(int e : a)
		{
			if(e==target)
			{
				found = true;
				break;
			}
		}
		if(found==true)
		{
			System.out.println("Array contains the given target");
		}
		else
		{
			System.out.println("Array not contains the given target");
		}
	}
}
