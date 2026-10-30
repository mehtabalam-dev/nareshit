package methodsPart02;

public class FactorialOfTheNumber {
	static void factorial(int a) {
		int f = 1;
		for(int i = 1; i<=a; i++) {
			f = f * i;
		}
		System.out.println(f);
	}
	public static void main(String[] args) {
		factorial(5);
	}

}
