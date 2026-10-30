package arrayPracticePrograms;

import java.util.Scanner;

/**
 * Q2)WAPT read integer array from user and print only even elements of
the given array.
Input :
5
12 13 67 80 34
Output :
Even elements are :
12
80
34
 */
public class Qsn02 
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
		System.out.print("Given elements are : ");
		for(int e : arr)
		{
			if(e%2==0)
			{
				System.err.print(e+" ");
			}
		}
	}
}
