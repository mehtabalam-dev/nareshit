package arrayPracticePrograms;

import java.util.Scanner;
/**
 * Q5.Write a program to find the largest element in an array.
 */
public class Qsn05 
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
		int largest = arr[0];
		for(int e : arr)
		{
			if(e>largest)
			{
				largest = e;
			}
		}
		System.out.println("The largest among all elements are : "+largest);
	}
}
