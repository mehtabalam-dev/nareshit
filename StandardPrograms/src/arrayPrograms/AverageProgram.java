package arrayPrograms;

import java.util.Scanner;

public class AverageProgram 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int []arr = new int[size];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		double sum = 0;
		for(int e : arr)
		{
			sum+=e;
		}
		System.out.println("Average = "+(sum/arr.length));
	}
}
