package collectionsPrograms;

import java.util.Scanner;
import java.util.Vector;

public class IntersectionOfVectors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two vector...");
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		System.out.println("Enter the number of element in first vector : ");
		int size1 = sc.nextInt();
		System.out.println("Enter first vector elements one by one : ");
		for(int i = 1; i <= size1; i++)
		{
			v1.add(sc.nextInt());
		}
		System.out.println("Enter the number of element in second vector : ");
		int size2 = sc.nextInt();
		System.out.println("Enter second vector elements one by one : ");
		for(int i = 1; i <= size2; i++)
		{
			v2.add(sc.nextInt());
		}
		v1.retainAll(v2);
		System.out.println(v1);
	}
}

