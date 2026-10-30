
package collectionsPrograms;

import java.util.Scanner;
import java.util.Stack;

public class StackQsn08 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter parentheses:");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<Character>();
        boolean isBalanced = true;

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') 
            {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}')
            {

                if (stack.isEmpty()) 
                {
                    isBalanced = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{'))
                {

                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced && stack.isEmpty())
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}
