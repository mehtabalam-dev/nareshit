package arrayPrograms;

import java.util.Scanner;

public class CheckTwoArrayEqual
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
		if(arr.length!=barr.length)
		{
			System.out.println("Arrays are not equal of their different lengths");
		}
		else
		{
			boolean areEqual = true;
			for(int i = 0; i<= arr.length-1; i++)
			{
				if(arr[i]!=barr[i])
				{
					areEqual = false;
					break;
				}
			}
			if(areEqual)
			{
				System.out.println("Arrays are equal");
			}
			else
			{
				System.out.println("Arrays are not equal");
			}
		}
	}
}
