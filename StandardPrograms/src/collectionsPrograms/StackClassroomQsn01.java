package collectionsPrograms;

import java.util.Scanner;
import java.util.Stack;

public class StackClassroomQsn01 
{
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        int tabs = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i <= tabs-1; i++)
        {
            String tabName = sc.nextLine();
            stack.push(tabName);
        }
        System.out.println("Stack before clear: "+stack);
        closeAllTabs(stack);
        System.out.println("Stack after clear: "+stack);
    }
    public static void closeAllTabs(Stack<String> tabs)
    {
        while(!tabs.isEmpty())
        {
            tabs.pop();
        }
        System.out.println("All tabs closed.");
    }
}
