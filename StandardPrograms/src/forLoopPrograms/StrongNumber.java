package forLoopPrograms;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp!=0) {
			int ld = temp % 10;
			int factorial = 1;
			for(int i = 1; i<= ld; i++)
			factorial = factorial * i;
			sum = sum + factorial;
			temp = temp / 10;
		}
		if(sum == num) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not a Strong Number");
		}
	}

}
