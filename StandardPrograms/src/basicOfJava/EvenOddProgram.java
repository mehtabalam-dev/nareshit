package basicOfJava;

public class EvenOddProgram 
{
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(IO.readln("Enter a number : ")); 
		
		if(n%2==0)
		{
			IO.println("Even Number");
		}else
		{
			IO.println("Odd Number");
		}
	}
}
