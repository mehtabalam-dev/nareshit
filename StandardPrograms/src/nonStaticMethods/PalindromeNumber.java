package nonStaticMethods;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		PalindromeNumber obj = new PalindromeNumber();
		System.out.println(obj.isPalindrome(num));
	}
	public boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while(temp!=0) {
			int ld = temp % 10;
			rev = (rev*10) + ld;
			temp = temp / 10;
		}
		if(rev==num) {
			return true;
		}else {
			return false;
		}
	}

}
