package basicOfJava;

import java.util.Scanner;

public class GradeProgram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num >=90 && num <=100)
		{
			System.out.println("A+");
		}
		else if(num >=80 &&  num <=89 )
		{
			System.out.println("A");
		}
		else if(num >=70 &&  num <=79 )
		{
			System.out.println("B");
		}
		else if(num >=60 &&  num <=69 )
		{
			System.out.println("C");
		}
		else if(num >=50 &&  num <=59 )
		{
			System.out.println("D");
		}
		else if(num >=35 &&  num <=49 )
		{
			System.out.println("E");
		}
		else if(num >=0 &&  num <=34 )
		{
			System.out.println("F");
		}
		else
		{
			System.out.println("Enter valid input");
		}
		
	}
}
