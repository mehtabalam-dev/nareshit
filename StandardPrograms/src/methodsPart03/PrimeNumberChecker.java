package methodsPart03;

public class PrimeNumberChecker {
	public static void main(String[] args) {
		System.out.println(isPrime());
	}
	public static boolean isPrime() {
		int num = 9;
		boolean isNPrime = true;
		if(num<=1) {
			return false;
		}
		for(int i= 2; i< num; i++) {
			if(num%i==0) {
				isNPrime=false;
			}
		}
		return isNPrime;
	}

}
