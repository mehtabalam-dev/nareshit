package arrayPrograms;

import java.util.Scanner;

public class BinarySearchSorted 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int []arr= new int[size];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to search: ");
		int target = sc.nextInt();
		boolean isPresent = false;
		int start = 0;
		int end = arr.length-1;
		while(start<=end)
		{
			int midIndex = (start+end)/2;
			if(arr[midIndex]==target)
			{
				isPresent=true;
				break;
			}
			if(target>arr[midIndex])
			{
				start = midIndex+1;
			}
			else
			{
				end = midIndex-1;
			}
		}
		if(isPresent)
		{
			System.out.println("Target is found in the array: "+target);
		}
		else
		{
			System.out.println("Target is not found in the array: "+target);
		}
	}
}
