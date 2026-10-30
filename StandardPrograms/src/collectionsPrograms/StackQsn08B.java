
package collectionsPrograms;

import java.util.Scanner;
import java.util.Stack;

public class StackQsn08B
{

    static boolean isMatching(char open, char close)
    {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter parentheses:");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<Character>();
        int i = 0;

        while (i < str.length()) 
        {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') 
            {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}') 
            {
                if (stack.isEmpty() ||
                    !isMatching(stack.peek(), ch))
                {

                    System.out.println("Not Balanced");
                    sc.close();
                    return;
                }

                stack.pop();
            }

            i++;
        }

        if (stack.isEmpty()) 
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
