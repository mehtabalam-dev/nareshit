package methodsPart03;

public class PalindromeNumberChecker {
	public static void main(String[] args) {
		System.out.println(palindromeNumber());
	}
	public static boolean palindromeNumber() {
		int num = 121;
		int temp = num;
		int rev = 0;
		while(temp!=0) {
			int ld = temp % 10;
			rev = (rev*10) + ld;
			temp = temp / 10;
		}
		if(rev==num) {
			return true;
		}else {
			return false;
		}
	}

}
