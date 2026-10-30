package switchPrograms;

import java.util.Scanner;

public class SimpleLoginRole 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your role: ");
		String input = sc.nextLine();
		String role = input.trim().toLowerCase();
		
		String output = switch(role)
				{
					case "admin" -> "Full access";
					case "manager" -> "Limited management access";
					case "employee" -> "Employee access";
					default -> "Invalid role";
				};
				System.out.println(output);
				sc.close();
	}
}
