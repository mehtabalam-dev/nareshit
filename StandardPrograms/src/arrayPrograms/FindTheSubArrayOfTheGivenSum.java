package arrayPrograms;

import java.util.Scanner;

public class FindTheSubArrayOfTheGivenSum
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
		System.out.println("Enter the target-sum");
		int target = sc.nextInt();
		boolean result = false;
		int minIndex = 0;
		int maxIndex = 0;
		outer:
		for(int i = 0; i<= arr.length-1; i++)
		{
			inner:
			for(int j = i; j<=arr.length-1;j++)
			{
				int sum = 0;
				System.out.print(i+","+j+" = ");
				for(int m = i; m<=j;m++)
				{
					sum = sum + arr[m];
					System.out.print(arr[m]+" ");
				}
				if(sum==target)
				{
					result = true;
					minIndex = i;
					maxIndex = j;
					break outer;
				}
			}
		}
		if(result==true)
		{
			for(int x = minIndex; x<= maxIndex; x++)
			{
				System.out.println();
				System.out.print(arr[x]+" ");
			}
		}
		else
		{
			System.out.println("There is no sub-array which gives sum of "+target);
		}
	}
}
