package arrayPracticePrograms;

import java.util.Scanner;

public class Qsn20 
{
	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter array size.");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		System.out.println("Enter array elements one by one...");
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			arr[i] = sc.nextInt();
//		}
		
		int arr[]= {1,1,4,5,2,3,2,4,5,3};
		
		boolean isAnyRepeated = false;
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			int count = 0;
			for(int j = 0; j <= arr.length-1; j++)
			{
				if(arr[j] == arr[i])
				{
					count++;
				}
			}
			if(count==1)
			{
				isAnyRepeated = true;
				System.out.println("First non repeated element : "+arr[i]);
				break;
			}
		}
		if(isAnyRepeated==false)
		{
			System.out.println("There is no non repeated element");
		}
	}
}
