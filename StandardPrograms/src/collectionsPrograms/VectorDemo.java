package collectionsPrograms;

import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(1,100);
		v.addElement(40);
		System.out.println(v);
		for(Integer e : v)
		{
			if(e>35)
			{
				System.out.println(e);
			}
		}
		for(int i = 0; i <= v.size()-1; i++)
		{
			if(v.get(i)>35)
			{
				System.out.println(v.get(i));
			}
		}
	}
}
