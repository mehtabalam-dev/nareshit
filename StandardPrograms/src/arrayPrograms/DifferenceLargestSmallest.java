package arrayPrograms;

import java.util.Scanner;

public class DifferenceLargestSmallest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int []arr = new int[size];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int largest = arr[0];
		for(int e : arr) 
		{
			if(e>largest) 
			{
				largest = e;
			}
		}
		System.out.println("Largest element is : "+largest);
		int smallest = arr[0];
		for(int e : arr)
		{
			if(e<smallest)
			{
				smallest = e;
			}
		}
		System.out.println("Smallest element is : "+smallest);
		System.out.println("Diffference : "+(largest-smallest));
	}
}
