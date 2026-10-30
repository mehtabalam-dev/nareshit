package methodsPart03;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sumOfDigits());
	}
	public static int sumOfDigits() {
		int num = 456;
		int sum = 0;
		while(num!=0) {
			int ld = num % 10;
			sum = sum + ld;
			num = num / 10;
		}
		return sum;
		
	}

}
