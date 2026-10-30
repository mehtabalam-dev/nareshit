package basicOfJava;

import java.util.Scanner;

public class ReadingStringData 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter your name : ");
//		String name = sc.next();  // InputMismatchException
		
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Given name is : " + name);
		System.out.println("Given age is : " + age);
		
	}

}
