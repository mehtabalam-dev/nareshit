package arrayPracticePrograms;

import java.util.Scanner;
/**
 * Q3)WAPT read integer array from user and print sum of the elements of
the given array.
Input :
5
12 13 67 80 34
Output :
Sum is : 206
 */
public class Qsn03 
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
		int sum = 0;
		for(int e : arr)
		{
			sum = sum + e;
		}
		System.out.println("Sum is : "+sum);
	}
}
