package methodsPart03;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println(reverseNumber());
	}
	public static int reverseNumber() {
	 
		int num = 987;
		int rev = 0;
		while(num!=0) {
			int ld = num % 10;
			rev = (rev*10) + ld;
			num = num / 10;
		}
		return rev;
	}

}
