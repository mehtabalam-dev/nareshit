package methodsPart01;

public class SumOfNumber {
	static void sumNumber() {
		int sum = 0;
		for(int i = 1; i<= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		sumNumber();
	}

}
