package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
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
		for(int i = 0; i <= arr.length-1; i++)
		{
			int minIndex = i;
			for(int j = i+1; j <= arr.length-1; j++)
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
