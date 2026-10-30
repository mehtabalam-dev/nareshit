package methodsPart03;

public class SumOfNumber {
	public static void main(String[] args) {
		System.out.println(sumOfNumber());
		
	}
	public static int sumOfNumber() {
		int sum = 0;
		for(int i = 1; i<= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
