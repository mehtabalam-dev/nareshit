package collectionsPrograms;

import java.util.Scanner;
import java.util.Vector;
/*
 * two pointers
 * reverse through for loop
 * collections.reverse
 * vector.reversed();
 */
public class ReverseVector 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a vector : ");
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Enter the size of the vector : ");
		int size = sc.nextInt();
		System.out.println("Enter elements one by one : ");
		for(int i = 1; i <= size; i++)
		{
			v.add(sc.nextInt());
		}
//		for(int i = size-1; i >= 0; i--)
//		{
//			System.out.println(v.get(i));
//		}
		System.out.println(v.reversed());
		System.out.println(v);
		
	}
}
