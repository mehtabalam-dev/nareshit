package arrayPrograms;

import java.util.Scanner;

public class MissingNumber
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
		int n = arr[arr.length-1];
		int totalSum = (n*(n+1)/2);
		int arraySum = 0;
		for(int e : arr)
		{
			arraySum+=e;
		}
		if(arraySum==totalSum)
		{
			System.out.println("No Missing element");
		}
		else
		{
			System.out.println("Missing element = "+(totalSum-arraySum));
		}
	}
}
