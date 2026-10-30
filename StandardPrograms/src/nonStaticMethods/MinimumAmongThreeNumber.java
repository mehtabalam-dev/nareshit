package nonStaticMethods;

import java.util.Scanner;

public class MinimumAmongThreeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number one by one...");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		MinimumAmongThreeNumber obj = new MinimumAmongThreeNumber();
		System.out.println(obj.findMin(a, b, c));
		
		
	}
	public int findMin(int a, int b, int c) {
		int result = (a<b) && (a<c) ? a : (b<c)? b :c;
		return result;
	}

}
