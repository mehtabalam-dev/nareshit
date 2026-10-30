package arrayPrograms;

import java.util.Scanner;

public class CheckSortedAscending
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int []arr=new int[size];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean isArrayinAscending = true;
		for(int i = 0; i<=arr.length-2;i++)
		{
			if(arr[i+1] < arr[i])
			{
				isArrayinAscending = false;
				break;
			}
		}
		if(isArrayinAscending)
		{
			System.out.println("Array is in ascending order");
		}
		else
		{
			System.out.println("Array is not in ascending order");
		}
	}
}
