package collectionsPrograms;

import java.util.Stack;

public class ValidParanthesisUsingStack
{
	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a paranthesis: ");
		String s = "{[()()]}";
		Stack<Character> stack = new Stack<Character>();
		boolean isBalanced = true;
		for(int i = 0; i <= s.length()-1; i++)
		{
			char ch = s.charAt(i);
			if(ch =='(' || ch == '[' || ch == '{')
			{
				stack.push(ch);
			}
			else if((ch == ')' && stack.pop() != '(') || (ch == ']' && stack.pop() != '[')|| (ch == '}' && stack.pop() != '{') )
			{
				isBalanced = false;
				break;
			}
		}
		if(isBalanced == true && stack.isEmpty())
		{
			System.out.println("Balanced String");
		}
		else
		{
			System.out.println("Not balanced String");
		}
		
	}
}
