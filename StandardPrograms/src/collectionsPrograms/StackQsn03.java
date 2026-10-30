package collectionsPrograms;

import java.util.Stack;

public class StackQsn03
{
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		System.out.println(stack.peek());
		System.out.println(stack);
	}
}
