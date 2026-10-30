package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateFromSortedArray 
{
	static boolean isPreviouslyPresent(int[] arr,int index)
	{
		boolean result = false;
		for(int i = 0; i<=index-1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				result = true;
				break;
			}
			 
		}
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array...");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i< arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int index = 0;
		int count = 0;
		for(int i = 0; i<= arr.length-1; i++)
		{
			if(isPreviouslyPresent(arr, index)==false)
			{
				count++;
			}
		}
		int [] barr = new int[count];
		int indexB = 0;
		for(int i = 0; i<= arr.length-1; i++)
		{
			if(isPreviouslyPresent(barr, indexB)==false)
			{
				barr[indexB] = arr[i];
				indexB++;
			}
		}
		System.out.println("Result = "+Arrays.toString(barr));
	}
}
