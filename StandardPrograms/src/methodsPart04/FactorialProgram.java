package methodsPart04;

public class FactorialProgram {
	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println(result);
	}
	public static int factorial(int num) {
		int factorial = 1;
		for(int i = 1; i<= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
