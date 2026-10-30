package arrayPracticePrograms;

import java.util.Scanner;
/**
 * Q19.Write a program to find the first repeating element.
 */
public class Qsn19 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size.");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements one by one...");
		for(int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
//		int firstRepeating = -1;
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			for(int j = i + 1; j <= arr.length-1; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					firstRepeating = arr[i];
//					break;
//				}
//			}
//			if(firstRepeating != -1)
//			{
//				break;
//			}
//		}
//		if(firstRepeating != -1)
//		{
//			System.out.println("First repeating element is : "+firstRepeating);
//		}
//		else
//		{
//			System.out.println("There is no repeating element.");
//		}
		boolean isRepeated = false;
		for(int i = 0; i <= arr.length-1; i++)
		{
			boolean isPreviouslyPresent = false;
			for(int j = 0; j <= i-1; j++)
			{
				if(arr[j] == arr[i])
				{
					isPreviouslyPresent = true;
					break;
				}
			}
			if(isPreviouslyPresent==true)
			{
				isRepeated = true;
				System.out.println("First repeated element : "+arr[i]);
				break;
			}
		}
		if(isRepeated==false)
		{
			System.out.println("No array elements are repeated.");
		}
	}
}
