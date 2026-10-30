package arrayPrograms;

import java.util.Scanner;

public class IntersectionOfTwoArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter first array elements one by onen: ");
		for(int i = 0; i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter second array size : ");
		int size2 = sc.nextInt();
		int[] barr = new int[size2];
		System.out.println("Enter second array elements one by onen: ");
		for(int i = 0; i<=barr.length-1;i++)
		{
			barr[i] = sc.nextInt();
		}
		for(int i = 0; i <= arr.length-1;i++)
		{
			boolean isPresent = false;
			for(int j = 0; j <= barr.length-1;j++)
			{
				if(barr[j]==arr[i])
				{
					isPresent = true;
					break;
				}
			}
			if(isPresent)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
