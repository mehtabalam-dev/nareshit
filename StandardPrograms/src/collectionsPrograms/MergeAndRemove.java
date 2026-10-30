package collectionsPrograms;

import java.util.Scanner;
import java.util.Vector;

public class MergeAndRemove 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two vector...");
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		System.out.println("Enter number of elements in first vector : ");
		int size1 = sc.nextInt();
		System.out.println("Enter first vector elements one by one");
		for(int i = 1; i <= size1;i++)
		{
			v1.add(sc.nextInt());
		}
		System.out.println("Enter number of elements in second vector : ");
		int size2 = sc.nextInt();
		System.out.println("Enter second vector elements one by one");
		for(int i = 1; i <= size2;i++)
		{
			v2.add(sc.nextInt());
		}
		v1.addAll(v2);
		Vector<Integer> result = new Vector<Integer>();
		for(Integer e : v1)
		{
			if(!result.contains(e))
			{
				result.add(e);
			}
		}
		System.out.println(result);
	}
}
