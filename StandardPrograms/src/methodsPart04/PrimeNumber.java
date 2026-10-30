package methodsPart04;

public class PrimeNumber {
	public static void main(String[] args) {
		boolean result = checkPrime(9);
		System.out.println(result);
	}
	public static boolean checkPrime(int num) {
		if(num<=1) {
			return false;
		}
		boolean isNprime = true;
		for(int i = 2; i< num; i++) {
			if(num%i == 0) {
				isNprime=false;
			}
		}
		return isNprime;
	}

}
