package collectionsPrograms;

import java.util.Stack;

public class StackQsn05 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.search(20));
		System.out.println(stack.search(99));
	}
}
