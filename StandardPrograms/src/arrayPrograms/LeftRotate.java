package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate
{
	static void leftRotate(int[] arr,int k)
	{
		for(int j=1; j<=k; j++)
		{
			int temp = arr[0];
			for(int i = 1; i<=arr.length-1;i++)
			{
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
		}
		System.out.println("Array after "+k+" left rotations : "+Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array.");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements one by one");
		for(int i = 0; i < size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value of k");
		int k = sc.nextInt();
		leftRotate(arr, k);
	}
}
