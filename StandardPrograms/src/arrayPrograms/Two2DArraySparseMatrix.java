package arrayPrograms;

import java.util.Scanner;

public class Two2DArraySparseMatrix 
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
		int count = 0;
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = 0; j <= arr[i].length-1; j++)
			{
				if(arr[i][j]==0)
				{
					count++;
				}
			}
		}
		if(count>((arr.length*arr.length)/2))
		{
			System.out.println("Sparse Matrix");
		}
		else
		{
			System.out.println("Not a sparse matrix");
		}
		
	}
}
