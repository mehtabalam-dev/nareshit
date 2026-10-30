package arrayPracticePrograms;

import java.util.Scanner;
/**
 * Q10.Write a program to reverse an array without using another array.
 */
public class Qsn10 
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
		int startIndex = 0;
		int endIndex = arr.length-1;
		while(startIndex<endIndex)
		{
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
		System.out.print("Result is :");
		for(int e : arr)
		{
			System.out.print(e+" ");
		}
		
	}
}
