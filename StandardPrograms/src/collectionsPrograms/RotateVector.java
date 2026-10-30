package collectionsPrograms;

import java.util.Scanner;
import java.util.Vector;

public class RotateVector
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
		System.out.println("Enter number of left rotation : ");
		int n= sc.nextInt();
//		for(int a = 1; a <= n%size; a++)
//		{
//			Integer temp = v.get(0);
//			for(int i = 1; i <= v.size()-1;i++)
//			{
//				v.set(i-1, v.get(i));
//			}
//			v.set(v.size()-1, temp);
//		}
//		System.out.println("Rotated Vector: " + v);
		while(n>0)
		{
			Integer temp = v.getFirst();
			for(int i = 1; i <= v.size()-1; i++)
			{
				v.set(i-1, v.get(i));
			}
			v.set(v.size()-1, temp);
			n--;
		}
		System.out.println("Rotated Vector: "+v);
	}
}
