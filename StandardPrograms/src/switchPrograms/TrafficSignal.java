package switchPrograms;

import java.util.Scanner;

public class TrafficSignal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter traffic signal color: ");
		String input = sc.nextLine();
		String signal = input.trim().toLowerCase();
		 
		
		String output = switch(signal)
				{
					case "red" -> "Stop";
					case "yellow" -> "Wait";
					case "green" -> "Go";
					default -> "Invalid signal";
				};
				System.out.println(input + " -> " + output);
				sc.close();
	}
}
