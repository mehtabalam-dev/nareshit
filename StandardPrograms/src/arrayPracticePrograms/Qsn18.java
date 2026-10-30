package arrayPracticePrograms;

import java.util.Scanner;
/**
 * }
Q18.Write a program to perform binary search on a sorted array.
 */
public class Qsn18 
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
		boolean isPresent = false;
		int start = 0;
		int end = arr.length-1;
		while(start<=end)
		{
			int midIndex = (start+end)/2;
			if(arr[midIndex]==target)
			{
				isPresent = true;
				break;
			}
			if(target>arr[midIndex])
			{
				start = midIndex + 1;
			}
			else
			{
				end = midIndex - 1;
			}
		}
		if(isPresent)
		{
			System.out.println(target+" is present in the array");
		}
		else
		{
			System.out.println(target+" is not present in the array");
		}
	}
}
