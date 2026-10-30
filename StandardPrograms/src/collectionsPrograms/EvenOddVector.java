package collectionsPrograms;

import java.util.Scanner;
import java.util.Vector;

public class EvenOddVector
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Enter size of vector: ");
		int size = sc.nextInt();
		System.out.println("Enter elements one by one: ");
		for(int i = 0; i <= size-1; i++)
		{
			v.add(sc.nextInt());
		}
		Vector<Integer> vEven = new Vector<Integer>();
		Vector<Integer> vOdd = new Vector<Integer>();
		
		for(int i = 0; i <= v.size()-1; i++)
		{
			Integer currentElement = v.get(i);
			if(currentElement % 2 == 0)
			{
				vEven.add(currentElement);
			}
			else
			{
				vOdd.add(currentElement);
			}
		}
		
//		for(Integer e : v)
//		{
//			if(e%2 == 0)
//			{
//				vEven.add(e);
//			}
//			else
//			{
//				vOdd.add(e);
//			}
//		}
		System.out.println("Even Vector: " + vEven);
		System.out.println("Odd Vector:  " + vOdd);
	}
}
