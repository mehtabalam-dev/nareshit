package methodsPart02;

public class ReverseOfTheNumber {
	static void reverseNumber(int n) {
		int rev = 0;
		int ld ;
		while(n != 0) {
			ld = n % 10;
			rev = (rev*10) + ld;
			n = n / 10;
		}
		System.out.println("Reverse = "+rev);
	}
	public static void main(String[] args) {
		reverseNumber(1234);
	}

}
