package arrayPrograms;

import java.util.Scanner;

public class Two2DArrayIdentityMatrix
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
		boolean isIdentityMatrix = true;
		outer:
		for(int i = 0; i <= arr.length-1; i++)
		{
			inner:
			for(int j = 0; j <= arr[i].length-1; j++)
			{
				if((i==j&&arr[i][j]!=1)||(i!=j&&arr[i][j]!=0))
				{
					isIdentityMatrix = false;
					break outer;
				}
			}
		}
		if(isIdentityMatrix)
		{
			System.out.println("Identity Matrix");
		}
		else
		{
			System.out.println("Not an identity matrix");
		}
	}
}
