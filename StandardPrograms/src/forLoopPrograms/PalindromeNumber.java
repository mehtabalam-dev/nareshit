package forLoopPrograms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;
		int rev = 0;
		while(temp!=0) {
			int ld = temp % 10;
			rev = (rev*10) + ld;
			temp = temp / 10;
		}
		if(rev==number) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a Palindrome Number");
		}
	}

}
