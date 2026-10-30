package arrayPracticePrograms;

import java.util.Scanner;
/**
 * Q11.Write a program to check whether a given element exists in the
	array (linear search) or not. Read an integer array from user, and
	target to search.
 */
public class Qsn11 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size.");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements one by one...");
		for(int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search");
		int target = sc.nextInt();
		boolean found = false;
		for(int e : arr)
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
			System.out.println("Array doest not contain the given target");
		}
		
	}
}
