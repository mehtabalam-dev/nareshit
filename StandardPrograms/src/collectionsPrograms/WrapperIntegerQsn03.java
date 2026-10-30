package collectionsPrograms;

import java.util.Scanner;

public class WrapperIntegerQsn03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Integer a = Integer.parseInt(sc.nextLine());
		Integer b = Integer.parseInt(sc.nextLine());
		System.out.println(Integer.max(a, b));
		System.out.println(Integer.min(a, b));
		System.out.println(Integer.sum(a,b));
		System.out.println(a.compareTo(b));
		
		
	}
}
