package arrayPracticePrograms;

import java.util.Scanner;
/**
 * Q15.Write a program to find the average of array elements.
 */
public class Qsn15 
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
		double sum = 0;
		for(int e : arr)
		{
			sum = sum + e;
		}
		System.out.println("Average = "+(sum/arr.length));
	}
}
