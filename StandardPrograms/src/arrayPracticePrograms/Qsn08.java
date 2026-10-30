package arrayPracticePrograms;

import java.util.Scanner;

/**
 * Q8.Write a program to find the nth smallest element in an array.
	Read n value and integer array from user.
 */
public class Qsn08 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size.");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements one by one...");
		for(int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter n value to print nth smallest");
		int n = sc.nextInt();
		for(int i = 0; i <= arr.length-1; i++)
		{
			int count = 0;
			for(int j = 0; j <= arr.length-1; j++)
			{
				if(arr[j] < arr[i])
				{
					count++;
				}
			}
			if(count==(n-1))
			{
				System.out.println("Result is : "+arr[i]);
				break;
			}
		}
	}
}
