package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort
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
		for(int cycle = 1; cycle <= arr.length-1; cycle++)
		{
			for(int i = 0; i <= arr.length-2; i++)
			{
				if(arr[i+1] > arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
