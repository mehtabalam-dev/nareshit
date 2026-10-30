package collectionsPrograms;

import java.util.Scanner;
import java.util.Vector;

public class MaxMinVector 
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
		Integer max = v.get(0);
		Integer min = v.get(0);
		
//		for(int i = 1; i <= v.size()-1; i++)
//		{
//			Integer currentElement = v.get(i);
//			
//			if(currentElement>max)
//			{
//				max = currentElement;
//			}
//			if(currentElement < min)
//			{
//				min = currentElement;
//			}
//		}
		for(Integer e : v)
		{
			if(e > max)
			{
				max = e;
			}
			if(e < min)
			{
				min = e;
			}
		}
		System.out.println("Maximum element: "+max);
		System.out.println("Minimum element: "+min);
		
	}
}
