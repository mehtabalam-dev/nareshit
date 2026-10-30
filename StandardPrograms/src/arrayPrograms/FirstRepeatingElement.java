package arrayPrograms;

import java.util.Scanner;

public class FirstRepeatingElement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int []arr=new int[size];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
//		boolean isAnyElementRepeated = false;
//		for(int i = 0; i<=arr.length-1; i++)
//		{
//			int count = 0;
//			for(int j = 0; j<=arr.length-1; j++)
//			{
//				if(arr[j]==arr[i])
//				{
//					count++;
//				}
//			}
//			if(count>1)
//			{
//				isAnyElementRepeated = true;
//				System.out.println("First repeated element is : "+arr[i]);
//				break;
//			}
//		}
//		if(isAnyElementRepeated==false)
//		{
//			System.out.println("No element is repeated..!!");
//		}
		int temp[] = new int[arr.length];
		int index = 0;
		for(int i = 0; i<=arr.length-1;i++)
		{
			boolean isPresentInTempOrNot = false;
		}
	}
}
