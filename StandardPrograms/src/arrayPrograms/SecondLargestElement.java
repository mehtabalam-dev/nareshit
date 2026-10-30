package arrayPrograms;

import java.util.Scanner;

//public class SecondLargestElement {

//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of the array:");
//		int size=sc.nextInt();
//		int []arr=new int[size];
//		
//		System.out.println("Enter the array elements:");
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		
//	
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			
//		}
//		System.out.print("After sorting elements in the array: ");
//		for(int a:arr)
//		{
//			System.out.print(a+" ");
//		}
//		
//		System.out.println("\nEnter the nth largest element:");
//		int n=sc.nextInt();//nth largest
//		
//		  int largest = arr[arr.length - 1];
//	        int secondLargest = 0;
//
//	        for (int i = arr.length-2; i >= 0; i--) {
//
//	            if (arr[i] != largest) {
//	                secondLargest = arr[i];
//	                break;
//	            }
//	            System.out.println("Nth largest element: " + arr[i]);
//	        }
//		
//		if (n == 1) {
//		    int largest = arr[arr.length - 1];
//		    System.out.println("1st largest element: " + largest);
//		}
//		
//		int count = 1;
//		int largest = arr[arr.length - 1];
//
//		for (int i = arr.length - 2; i >= 0; i--) {
//
//		    if (arr[i] != arr[i + 1]) {
//		        count++;
//
//		        if (count == n) {
//		            System.out.println("Nth largest element: " + arr[i]);
//		            break;
//		        }
//		    }
//		}
	
		
//	}
//}
