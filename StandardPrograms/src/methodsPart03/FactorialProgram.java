package methodsPart03;
/*
 * 
 *  PART 3
	Method without arguments & with return type 

 */
public class FactorialProgram {
	public static void main(String[] args) {
		System.out.println("Factorial = "+factorial());
	}
	public static int factorial() {
		int f = 1;
		for(int i = 1; i<= 5; i++) {
			f = f * i;
		}
		return f;
	}

}
