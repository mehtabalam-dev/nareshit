package arrayPracticePrograms;

import java.util.Scanner;
/**
 * Q16.Write a program to find the difference between largest and
	smallest element without sorting.
 */
public class Qsn16 
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
//		int largest = arr[0];
//		int smallest = arr[0];
//		for(int e : arr)
//		{
//			if(e>largest)
//			{
//				largest = e;
//				System.out.println(largest);
//			}
//			if(e<smallest)
//			{
//				smallest = e;
//				System.out.println(smallest);
//			}
//		}
//		System.out.println("Difference between largest and smallest is : "+(largest-smallest));
		for(int i = 0; i <= arr.length-2; i++)
		{
			for(int j = i+1; j <= arr.length-1; j++)
			{
				if(arr[j]<arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted array: ");
		for(int e : arr)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		int smallest = arr[0];
		int largest = arr[arr.length-1];
		System.out.println("Difference between largest and smallest is : "+(largest- smallest));
	}
}
