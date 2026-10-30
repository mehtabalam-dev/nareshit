package arrayPrograms;

import java.util.Scanner;

public class NthLargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array...");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i = 0; i<=a.length-1;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter n value to print nth largest");
		int n = sc.nextInt();
		//first largest
		//max 
		//min value
		//if(arr[i>largest&&arr[i<max){
		//min=arr[i]
		for(int i = 0; i<=a.length-1; i++) {
			int count = 0;
			for(int j = 0; j<=a.length-1; j++) {
				if(a[j]>a[i]) {
					count++;
				}
			}
			if(count==(n-1)) {
				System.out.println("Result : "+a[i]);
				break;
			}
		}
	}

}
