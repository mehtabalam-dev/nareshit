package arrayPrograms;

import java.util.Scanner;

public class FrequencyOfEachElement 
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
		for(int i = 0; i <= arr.length-1; i++)
		{
			boolean isPreviouslyPresent = false;
			for(int j = 0; j <= i-1; j++)
			{
				if(arr[j]==arr[i])
				{
					isPreviouslyPresent = true;
					break;
				}
			}
			if(isPreviouslyPresent==false)
			{
				int count = 0;
				for(int j = 0; j <= arr.length-1; j++)
				{
					if(arr[j]==arr[i])
					{
						count++;
					}
				}
				System.out.println(arr[i]+" is repeated "+count+" times(s)");
			}
		}
		
	}
}
