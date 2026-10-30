package functionalInterface;

public class Qsn02 
{
	public static void main(String[] args)
	{
		displayName(() -> 
		{
			return "Hello";
		});
//		displayName(String::toUpperCase);
	}
	public static void displayName(NameClass1 op)
	{
		System.out.println(op.getName());
	}
}
interface NameClass1
{
	String getName();
}