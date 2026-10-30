package collectionsPrograms;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		table.put(101,98);
		table.put(102, 96);
		table.put(103, 32);
		table.put(103, 99);
		for(Integer key : table.keySet())
		{
			System.out.println(key);
		}
		for(Integer value : table.values())
		{
			System.out.println(value);
		}
		for(Map.Entry<Integer,Integer> entry : table.entrySet())
		{
			System.out.println(entry);
		}
		System.out.println(table);
	}
}
