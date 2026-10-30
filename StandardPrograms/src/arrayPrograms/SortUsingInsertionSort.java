package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortUsingInsertionSort 
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
		for(int i = 1; i<=arr.length-1;i++)
		{
			int current = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>current)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		System.out.println(Arrays.toString(arr));
	}
}
