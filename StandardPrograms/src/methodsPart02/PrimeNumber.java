package methodsPart02;

public class PrimeNumber {
	static void checkPrimeNumber(int n) {
		int count = 0;
		for(int i = 1; i<= n; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		
	}
	public static void main(String[] args) {
		checkPrimeNumber(9);
	}

}
