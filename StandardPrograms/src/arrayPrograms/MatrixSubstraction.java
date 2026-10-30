package arrayPrograms;

import java.util.Scanner;

public class MatrixSubstraction 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows of first matrix : ");
		int rows1 = sc.nextInt();
		System.out.println("Enter number of columns of first matrix : ");
		int column1 = sc.nextInt();
		int [][] arr = new int[rows1][column1];
		System.out.println("Enter the matrix : ");
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = 0; j <= arr[i].length-1; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter number of rows second matrix : ");
		int rows2 = sc.nextInt();
		System.out.println("Enter number of columns second matrix : ");
		int column2 = sc.nextInt();
		int [][] barr = new int[rows2][column2];
		System.out.println("Enter the matrix : ");
		for(int i = 0; i <= barr.length-1; i++)
		{
			for(int j = 0; j <= barr[i].length-1; j++)
			{
				barr[i][j] = sc.nextInt();
			}
		}
		int[][] carr = new int[arr.length][barr.length];
		for(int i = 0; i <= carr.length-1; i++)
		{
			for(int j = 0; j <= carr[i].length-1; j++)
			{
				carr[i][j] = arr[i][j]-barr[i][j];
			}
		}
		System.out.println("Result = ");
		for(int i = 0; i <= carr.length-1; i++)
		{
			for(int j = 0; j <= carr[i].length-1; j++)
			{
				System.out.print(carr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
