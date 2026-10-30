package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements one by onen: ");
		for(int i = 0; i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter second array size : ");
		int size2 = sc.nextInt();
		int[] barr = new int[size2];
		System.out.println("Enter array elements one by onen: ");
		for(int i = 0; i<=barr.length-1;i++)
		{
			barr[i] = sc.nextInt();
		}
		int[] carr = new int[arr.length+barr.length];
		int index =  0; 
		for(int i = 0; i <= arr.length-1; i++)
		{
			carr[index] = arr[i];
			index++;
		}
		for(int i = 0; i <= barr.length-1; i++)
		{
			carr[index] = barr[i];
			index++;
		}
		System.out.println("Merge Array : "+Arrays.toString(carr));
	}
}
