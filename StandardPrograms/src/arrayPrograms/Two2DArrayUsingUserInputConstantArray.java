package arrayPrograms;

import java.util.Scanner;

public class Two2DArrayUsingUserInputConstantArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter outer array size");
		int size1 = sc.nextInt();
		System.out.println("Enter inner array's size");
		int size2 = sc.nextInt();
		int [][] arr = new int[size1][size2]; 
		System.out.println("Enter 2-D array elements one by one : ");
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = 0; j <= arr[i].length-1; j++)
			{
				 arr[i][j] = sc.nextInt();
			}
 
		}
		System.out.println("Given 2-D array is : ");
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = 0; j <= arr[i].length-1; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
