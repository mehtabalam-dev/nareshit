package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayUsingMethod 
{
//	static void reverseArray(int[] arr)
//	{
//		int[] barr = new int[arr.length];
//		for(int i = 0; i<arr.length;i++)
//		{
//			barr[i] = arr[(arr.length-1)-i];
//			
//		}
//		System.out.println("Result = "+Arrays.toString(barr));
//	}
	
	static int[] reverseArray(int[] arr)
	{
		int left = 0;
		int right = arr.length-1;
		while(left<right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right++;
		}
		return arr;
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
		reverseArray(arr);
	}
}
