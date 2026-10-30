package nonStaticMethods;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		ReverseNumber obj = new ReverseNumber(); 
		obj.reverseNumber(num);
		
	}
	public void reverseNumber(int num) {
		int rev = 0;
		while(num!=0) {
			int ld = num % 10;
			rev = (rev*10) + ld;
			num = num /10;
			
		}
		
		System.out.println(rev);
		
	}

}
