package whileLoop;

import java.util.Scanner;

public class PalindromeInRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a min number: ");
		int min = sc.nextInt();
		System.out.println("Enter a max number: ");
		int max = sc.nextInt();
		
		for(int num = min; num <= max; num++)
		{
			int temp = num;
			int rev = 0;
			while(temp != 0)
			{
				int ld = temp % 10;
				rev = (rev*10) + ld;
				temp /= 10;
			}
			if(rev == num)
			{
				System.out.println(num);
			}
		}
	}
}
