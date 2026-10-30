package arrayPrograms;

import java.util.Scanner;

public class SumOfSubArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array...");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements one by one : ");
		for(int i = 0; i <= arr.length-1; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Subarrays are: ");
		for(int i = 0; i<= arr.length-1; i++)
		{
			for(int j = i; j<=arr.length-1;j++)
			{
				System.out.print(i+","+j+" = ");
				for(int m = i; m<=j;m++)
				{
					System.out.print(arr[m]+" ");
				}
				System.out.println();
			}
		}
	}
}
