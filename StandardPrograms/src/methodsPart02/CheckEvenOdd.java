package methodsPart02;

public class CheckEvenOdd {
	static void checkEvenOdd(int a) {
		if(a % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	public static void main(String[] args) {
		checkEvenOdd(5);
	}

}
