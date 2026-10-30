package collectionsPrograms;

import java.util.Hashtable;

public class HashTableQsn01
{
	public static void main(String[] args)
	{
		String str = "ABACBAD";
		Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
		for(int i = 0; i <= str.length()-1; i++)
		{
			Character ch = str.charAt(i);
			if(!table.containsKey(ch))
			{
				table.put(ch, 1);
			}
			else
			{
				table.put(ch, (table.get(ch) + 1));
			}
		}
		System.out.println(table);
	}
}
