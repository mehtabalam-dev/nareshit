package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllNegativeNumberToTheRight 
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
		int index = 0;
		for(int i= 0; i< arr.length; i++)
		{
			if(arr[i]<0)
			{
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index++;
			}
		}
		System.out.println("Result = "+Arrays.toString(arr));
	}
}
