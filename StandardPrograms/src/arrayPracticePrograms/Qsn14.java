package arrayPracticePrograms;

import java.util.Scanner;
/**
 * Q14.Write a program to print all elements present at even index
	positions.
 */
public class Qsn14 
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
		for(int i = 0; i <= arr.length-1; i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]+" ");
			}
		}
	}
}
