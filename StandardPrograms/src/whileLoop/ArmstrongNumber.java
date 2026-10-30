package whileLoop;

import java.util.Scanner;

/*
 * An Armstrong number (also called a narcissistic number) is a positive
integer equal to the sum of its own digits, each raised to the power
of the total number of digits. For instance, 153 is an Armstrong
number because it has 3 digits, and 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
 */
public class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		//step-01 : count the number of digits using temp
		int count = 0;
		while(temp!=0)
		{
			count++;
			temp = temp / 10;
		}
		temp = num;
		//step-02 : find sum of digits with power of count
		double sum = 0;
		while(temp != 0)
		{
			//step - 2.1 : take ld from temp
			int ld = temp % 10;
			//step - 2.2 : find ld to the power count.
			double power = Math.pow(ld, count);
			
			// By using for loop power calculation
//			int power = 1;
//			for(int i = 1; i<=count; i++) {
//				power = power *ld;
//			}
			
			
			//step - 2.3 : add power to sum
			sum = sum + power;
			//step - 2.4 : remove ld from temp
			temp = temp / 10;
			
		}
		if(sum==num)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
		
	}
}
