package arrayPrograms;

import java.util.Scanner;

public class AllPairsWhoseSumEqualToGivenNumber 
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
		System.out.println("Enter target sum : ");
		int sum = sc.nextInt();
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = i+1; j <= arr.length-1; j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}
}
