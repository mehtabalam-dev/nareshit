package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotate 
{
	static void rightRotate(int[] arr, int k)
	{
		for(int j = 1; j<=k;j++)
		{
			int temp = arr[arr.length-1];
			for(int i = arr.length-2;i>=0;i--)
			{
				arr[i+1] = arr[i]; 
			}
			arr[0] = temp;
		}
		System.out.println("Array after "+k+" right rotations : "+Arrays.toString(arr));
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array...");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements one by one...");
		for(int i = 0; i< arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value of k...");
		int k = sc.nextInt();
		rightRotate(arr,k);
	}
}
