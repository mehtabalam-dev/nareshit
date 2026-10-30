package methodsPart04;

public class SumOfDigits {
	public static void main(String[] args) {
		int result = sumOfDigits(543);
		System.out.println(result);
	}
	public static int sumOfDigits(int num) {
		int sum = 0;
		while(num!=0) {
			int ld = num % 10;
			sum = sum + ld;
			num = num / 10;
			
		}
		return sum;
	}

}
