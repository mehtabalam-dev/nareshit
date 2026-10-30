package methodsPart02;

public class SumOfDigits {

	static void sumOfDigits(int n) {
		int sum = 0;
		int ld ;
		while(n!=0) {
			ld = n % 10;
			sum = sum + ld;
			n = n / 10;
		}
		System.out.println("Sum of digits = "+sum);
	}
	public static void main(String[] args) {
		sumOfDigits(1234);
	}

}
