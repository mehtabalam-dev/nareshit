package arrayPrograms;

import java.util.Scanner;

public class EvenIndexElement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int []arr= new int[size];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<=arr.length-1; i++)
		{
			if(i%2!=0)
			{
				System.out.println(arr[i]+" ");
			}
		}
	}
}
