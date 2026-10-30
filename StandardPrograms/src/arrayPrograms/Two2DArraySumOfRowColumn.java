package arrayPrograms;

import java.util.Scanner;

public class Two2DArraySumOfRowColumn 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns : ");
		int column = sc.nextInt();
		int [][] arr = new int[rows][column];
		System.out.println("Enter the matrix : ");
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = 0; j <= arr[i].length-1; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i <= arr.length-1; i++)
		{
			int sumRow = 0;
			for(int j = 0; j <= arr[i].length-1;j++)
			{
				sumRow = sumRow + arr[i][j];
			}
			System.out.println("Sum of " + (i+1) +" row: " + sumRow);
		}
		for(int i = 0; i <= arr.length-1; i++)
		{
			int sumColumn = 0;
			for(int j = 0; j <= arr[i].length-1;j++)
			{
				sumColumn = sumColumn + arr[j][i];
			}
			System.out.println("Sum of " + (i+1) +" column: " + sumColumn);
		}
 
	}
}
