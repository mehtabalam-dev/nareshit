package arrayPracticePrograms;

import java.util.Scanner;
/**
 * 17.Write a program to check whether an array is sorted in ascending
	order.
 */
public class Qsn17 
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
		boolean isArrayInAscendingOrder = true;
		for(int i = 0; i <= arr.length-2; i++)
		{
			if(arr[i+1]<arr[i])
			{
				isArrayInAscendingOrder = false;
				break;
			}
		}
		if(isArrayInAscendingOrder)
		{
			System.out.println("Array is in ascending order");
		}
		else
		{
			System.out.println("Array is not in ascending order");
		}
	}
}
