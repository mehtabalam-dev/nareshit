package whileLoop;

import java.util.Scanner;

public class ProductOfDigitsGivenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int prod = 1;
		while(num != 0)
		{
			prod = prod * (num % 10);
			num = num /10;
		}
		System.out.println(prod);
	}
}
