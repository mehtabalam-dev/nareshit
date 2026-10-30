package functionalInterface;

public class MethodReference 
{
	public static void main(String[] args)
	{
		printSquare(5, Student1::cube);
	}
	public static void printSquare(int value,MathsClass1 op)
	{
		op.getSquare(value);
	}
}
interface MathsClass1
{
	void getSquare(int value);
}
class Student1
{
	public static void cube(int value)
	{
		System.out.println("Bahubali");
	}
}