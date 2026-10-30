package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZeroToTheLeft 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array...");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i< arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] barr = new int[arr.length];
		int indexB = 0;
		for(int i = 0; i< arr.length;i++)
		{
			if(arr[i]!=0)
			{
				barr[indexB] = arr[i];
				indexB++;
			}
		}
		System.out.println("Result is : "+Arrays.toString(barr));
		
	}
}
