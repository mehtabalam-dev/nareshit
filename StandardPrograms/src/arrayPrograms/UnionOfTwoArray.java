package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class UnionOfTwoArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements one by onen: ");
		for(int i = 0; i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter second array size : ");
		int size2 = sc.nextInt();
		int[] barr = new int[size2];
		System.out.println("Enter array elements one by onen: ");
		for(int i = 0; i<=barr.length-1;i++)
		{
			barr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i <= barr.length-1; i++)
		{
			boolean isPresent = false;
			for(int j = 0; j <= arr.length-1; j++)
			{
				if(arr[j]==barr[i])
				{
					isPresent = true;
					break;
				}
			}
			if(isPresent==false)
			{
				count++;
			}
		}
		int[] result = new int[arr.length+count];
		for(int i = 0; i <= arr.length-1; i++)
		{
			result[i] = arr[i];
		}
		int index = arr.length;
		for(int i = 0; i <= barr.length-1; i++)
		{
			boolean isPresent = false;
			for(int j = 0; j <= arr.length-1; j++)
			{
				if(arr[j]==barr[i])
				{
					isPresent = true;
					break;
				}
			}
			if(isPresent==false)
			{
				result[index] = barr[i];
				index++;
			}
		}
		System.out.println("Result array = "+Arrays.toString(result));
	}
}
