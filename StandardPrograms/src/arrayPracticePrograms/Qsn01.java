package arrayPracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Q1)WAPT read an integer array from user and print the array.
 */
public class Qsn01 
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
//		System.out.println("Given array is : "+Arrays.toString(arr));
		System.out.print("Given array is : ");
		for(int e : arr)
		{
			System.out.print(e +" ");
		}
		System.out.println();
	}
}
