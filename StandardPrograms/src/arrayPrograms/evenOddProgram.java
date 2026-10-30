package arrayPrograms;

import java.util.Scanner;

public class evenOddProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i = 0; i<=a.length-1;i++) {
			a[i] = sc.nextInt();
		}
		int evenCount = 0;
		int oddCount = 0;
		for(int e : a) {
			if(e%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("Count of even elements: "+evenCount);
		System.out.println("Count of even elements: "+oddCount);
	}

}
