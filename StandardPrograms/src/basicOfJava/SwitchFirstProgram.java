package basicOfJava;

public class SwitchFirstProgram 
{
	public static void main(String[] args)
	{
		int a = 2;
		String result = switch(a) {
		case 1 -> 
		{
			System.out.println("Apple");
			System.out.println("Mango");
			yield "A";
		}
		case 2 -> "B";
		case 3 -> "C";
		case 4 -> "D";
		case 5 -> "E";
		default -> "Enter valid input";
		};
		System.out.println(result);
	}
}
