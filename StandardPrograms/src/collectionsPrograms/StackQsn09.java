package collectionsPrograms;

import java.util.Scanner;
import java.util.Stack;

public class StackQsn09 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i <= str.length()-1; i++)
		{
			char ch = str.charAt(i);
			if(stack.isEmpty() || stack.peek() != ch)
			{
				stack.push(ch);
			}
		}
		String result = "";
		while(!stack.isEmpty())
		{
			result = stack.pop() + result;
		}
		System.out.println(result);
	}
}
