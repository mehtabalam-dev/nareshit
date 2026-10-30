package arrayPracticePrograms;

import java.util.Scanner;
/**
 * Q9.Write a program to reverse an array with using another array.
 */
public class Qsn09
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
		int[] barr = new int[arr.length];
		for(int i = 0; i <= arr.length-1; i++)
		{
			barr[i] = arr[(arr.length-1)-i];
		}
		System.out.print("Result is : ");
		for(int e : barr)
		{
			System.out.print(e+" ");
		}
	}
}
