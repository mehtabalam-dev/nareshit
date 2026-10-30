package functionalInterface;

public class ShortcutReturn
{
	public static void main(String[] args)
	{
		MathsClass s = n -> n*n;
		System.out.println(s.getSquare(100));
		printSquare(5, n -> n*n);
	}
	public static void printSquare(int value, MathsClass op)
	{
		System.out.println(op.getSquare(value));
	}
}
interface MathsClass
{
	int getSquare(int n);
}