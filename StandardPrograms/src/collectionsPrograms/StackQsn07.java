package collectionsPrograms;

import java.util.Scanner;
import java.util.Stack;

public class StackQsn07 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i <= str.length()-1; i++)
		{
			stack.push(str.charAt(i));
		}
		String reverse = "";
//		while(!stack.isEmpty())
//		{
//			reverse += stack.pop();
//		}
//		System.out.println(reverse);
		int size = stack.size();
		for(int i = 0; i <= size-1; i++)
		{
			reverse += stack.pop();
		}
		System.out.println(reverse);
	}
}
