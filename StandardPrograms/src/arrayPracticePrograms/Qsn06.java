package arrayPracticePrograms;

import java.util.Scanner;
/**
 * Q6.Write a program to find the smallest element in an array.
 */
public class Qsn06 
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
		int smallest = arr[0];
		for(int e : arr)
		{
			if(e<smallest)
			{
				smallest = e;
			}
		}
		System.out.println("The smallest among all elements are : "+smallest);
	}
}
