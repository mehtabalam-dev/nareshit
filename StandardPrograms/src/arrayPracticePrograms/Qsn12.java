package arrayPracticePrograms;

import java.util.Scanner;
/**
 * Q12.Write a program to count how many times a given number appears in
	an array.
 */
public class Qsn12
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
		System.out.println("Enter element to search");
		int target = sc.nextInt();
		int count = 0;
		for(int e : arr)
		{
			if(e==target)
			{
				count++;
			}
		}
		System.out.println(target+" appeared "+count+" time(s)");
		
	}
}
