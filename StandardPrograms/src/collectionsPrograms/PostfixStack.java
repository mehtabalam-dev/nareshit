package collectionsPrograms;

import java.util.Stack;

public class PostfixStack 
{
	public static void main(String[] args) 
	{
		String str = "512+4*+3-";
		String [] a = str.split("");
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i <= a.length-1; i++)
		{
			String temp = a[i];
			try
			{
				stack.push(Integer.parseInt(a[i]));
			}
			catch(NumberFormatException e)
			{
				if(stack.size() >= 2)
				{
					int x = stack.pop();
					int y = stack.pop();
					switch(temp)
					{
					case "+" -> stack.push(y+x);
					case "-" -> stack.push(y-x);
					case "*" -> stack.push(y*x);
					case "/" -> stack.push(y/x);
					case "%" -> stack.push(y%x);
		
					}
				}
			}
		}
		System.out.println(stack.pop());
	}
}
