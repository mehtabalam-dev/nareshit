package collectionsPrograms;

import java.util.Stack;

public class StackQsn06 
{
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}
}
