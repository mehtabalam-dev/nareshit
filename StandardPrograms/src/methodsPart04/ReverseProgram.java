package methodsPart04;

public class ReverseProgram {
	public static void main(String[] args) {
		int num1 = 234, num2 = 217, num3 = 924, num4 = 678;
		System.out.println("Reverse of the first number is : "+reverseNumber(num1));
		System.out.println("Reverse of the second number is : "+reverseNumber(num2));
		System.out.println("Reverse of the third number is : "+reverseNumber(num3));
		System.out.println("Reverse of the fourth number is : "+reverseNumber(num4));
		
	}
	public static int reverseNumber(int num) {
		int rev = 0;
		while(num!=0) {
			int ld = num % 10;
			rev = (rev*10) + ld;
			num = num / 10;
		}
		return rev;
	}

}
