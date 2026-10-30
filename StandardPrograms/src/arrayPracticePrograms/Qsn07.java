package arrayPracticePrograms;

import java.util.Scanner;

/**
 * Q7.Write a program to find the nth largest element in an array.
	Read n value and integer array from user.
	Input : {23,19,14,25,35,27} n=3
	xOutput : 25
 */
public class Qsn07
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
		System.out.println("Enter n value to print nth largest");
		int n = sc.nextInt();
		for(int i = 0; i <= arr.length-1; i++)
		{
			int count = 0;
			for(int j = 0; j <= arr.length-1; j++)
			{
				if(arr[j]>arr[i])
				{
					count++;
				}
			}
			if(count==(n-1))
			{
				System.out.println("Result :"+arr[i]);
				break;
			}
		}
		
	}
}
