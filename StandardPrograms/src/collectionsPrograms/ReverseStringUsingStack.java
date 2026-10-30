package collectionsPrograms;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i <= str.length()-1; i++)
		{
			stack.push(str.charAt(i));
		}
		String result = "";
//		int size = stack.size();
		for(int i = 0; i <= stack.size()-1; i++)
		{
			result += stack.pop();
		}
		System.out.println(result);
	}
}
