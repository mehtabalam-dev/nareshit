package switchPrograms;

import java.util.Scanner;

public class YieldPrograms
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day number(1-7): ");
		
		int day = sc.nextInt();
		String type = switch(day)
				{
					case 1,2,3,4,5  ->{
						System.out.println("Hard work mode ON!");
						yield "Weekday";
					}
					case 6,7 ->{
						System.out.println("Party or rest mode ON!");
						yield "Weekend";
					}
					default -> {
						yield "Invalid Day Number";
					}
				};
				System.out.println("Result: " +type);
	}
}
