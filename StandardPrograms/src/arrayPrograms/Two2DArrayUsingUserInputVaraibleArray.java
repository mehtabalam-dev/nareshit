package arrayPrograms;

import java.util.Scanner;
/**
 * Jagged array
 */
public class Two2DArrayUsingUserInputVaraibleArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter outer array size");
		int outerSize = sc.nextInt();
		int [][] arr = new int[outerSize][];
		System.out.println("Enter array elements one by one : ");
		for(int i = 0; i <= arr.length-1; i++)
		{
			System.out.println("Enter "+(i+1)+" inner array size");
			int innerArraySize = sc.nextInt();
			arr[i] = new int[innerArraySize];
			System.out.println("Enter "+(i+1)+" inner array elements one by one : ");
			for(int j = 0; j <= arr[i].length-1; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Given Two dimentional jagged array is : ");
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
