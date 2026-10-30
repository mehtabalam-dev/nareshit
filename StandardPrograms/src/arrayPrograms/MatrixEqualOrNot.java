package arrayPrograms;

import java.util.Scanner;

public class MatrixEqualOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows of first matrix : ");
		int rows1 = sc.nextInt();
		System.out.println("Enter number of columns of second matrix : ");
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
		System.out.println("Enter number of rows : ");
		int rows2 = sc.nextInt();
		System.out.println("Enter number of columns : ");
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
		boolean equal = true;
		outer :
		for(int i = 0; i <= arr.length-1; i++)
		{
			inner :
			for(int j = 0; j <= arr[i].length-1; j++)
			{
				if(arr[i][j]!=barr[i][j])
				{
					equal = false;
					break outer;
				}
			}
		}
		if(equal)
		{
			System.out.println("Matrix are equal.");
		}
		else
		{
			System.out.println("Matrix are not equal.");
		}
	}
}
