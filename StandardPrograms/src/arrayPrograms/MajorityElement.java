package arrayPrograms;

import java.util.Scanner;

public class MajorityElement 
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
			int count = 0;
			for(int j = 0; j <= arr.length-1; j++)
			{
				if(arr[j] == arr[i])
				{
					count++;
				}
				
			}
			if(count>arr.length/2)
			{

				System.out.println("Majority Element: " + arr[i] + " (count is " + count + ")");
				break;
			}
		}
	}
}