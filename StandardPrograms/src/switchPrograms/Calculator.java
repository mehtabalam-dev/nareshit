package switchPrograms;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------");
		int firstNumber = sc.nextInt();
		char ch = sc.next().charAt(0);
		int secondNumber = sc.nextInt();
		
		switch(ch)
		{
			case '+' -> System.out.println(firstNumber + secondNumber);
			case '-' -> System.out.println(firstNumber - secondNumber);
			case '*' -> System.out.println(firstNumber * secondNumber);
			case '/' -> 
			{
				if(secondNumber == 0)
				{
					System.out.println("Error: Division by zero");
				}
				else
				{
					System.out.println(firstNumber / secondNumber);
				}
			}
			
			case '%' -> System.out.println(firstNumber % secondNumber);
			default -> System.out.println("Invalid operator");
				
		}
	}
}
