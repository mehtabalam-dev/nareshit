package arrayPracticePrograms;

import java.util.Scanner;

/**
 * Q4.Write a Java program to count the number of even and odd elements
in an array.
 */
public class Qsn04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size.");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements one by one...");
		for(int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		int evenCount = 0;
		int oddCount = 0;
		for(int e : arr)
		{
			if(e%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Number of even elements : "+evenCount);
		System.out.println("Number of odd elements  : "+oddCount);
	}
}
