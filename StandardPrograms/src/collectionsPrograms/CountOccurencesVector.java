package collectionsPrograms;

import java.util.Scanner;
import java.util.Vector;

public class CountOccurencesVector 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Enter the size of the vector : ");
		int size = sc.nextInt();
		System.out.println("Enter elements one by one : ");
		for(int i = 0; i <= size-1; i++)
		{
			v.add(sc.nextInt());
		}
		System.out.println("Enter the target number to search for: ");
		Integer target = Integer.parseInt(sc.next());
		Integer count = 0;
		for(Integer e : v)
		{
			if(e == target)
			{
				count++;
			}
		}
		System.out.println(target + " appears " + count + " times.");
	}
}
