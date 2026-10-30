package functionalInterface;

public class Qsn01 
{
	public static void main(String[] args) 
	{
//		NameClass n1 = new NameClass()
//				{
//					public String getName()
//					{
//						return "Java Programming lang";
//					}
//				};
				
				NameClass n1 = () -> "Java programming lang";
//				System.out.println(n1.getName());
				displayName(n1);
				
//				System.out.println(n1.getName());
	}
	
	public static void displayName(NameClass obj)
	{
		System.out.println(obj.getName());
	}
}

interface NameClass
{
	String getName();
}
