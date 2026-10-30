package arrayPrograms;

import java.util.Scanner;

public class largestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i = 0; i<=a.length-1;i++) {
			a[i] = sc.nextInt();
		}
		int largest = a[0];
		for(int e : a) {
			if(e>largest) {
				largest = e;
			}
		}
		System.out.println("Largest element is : "+largest);
	}

}
