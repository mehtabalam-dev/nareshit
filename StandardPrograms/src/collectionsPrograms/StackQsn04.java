package collectionsPrograms;

import java.util.Stack;

public class StackQsn04
{
	public static void main(String[] args)
	{
		Stack<Character> stack = new Stack<Character>();
//		System.out.println(stack.empty());
//		stack.push(10);
//		stack.push(20);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
		stack.push('(');
		stack.push('(');
		stack.push('(');
		System.out.println(stack.isEmpty());
	}
}
