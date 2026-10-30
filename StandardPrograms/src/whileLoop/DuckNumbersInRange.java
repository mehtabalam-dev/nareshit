package whileLoop;

import java.util.Scanner;

public class DuckNumbersInRange 
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
			//step-01 find product of digits of temp
			int product = 1;
			while(temp != 0)
			{
				int ld = temp % 10;
				product = product * ld;
				temp = temp / 10;
			}
			if(product == 0)
			{
				System.out.println(num);
			}
		}
		
	}
}
