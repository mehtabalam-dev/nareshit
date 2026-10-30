package conditionalPracticeQuestion;

public class LargestThreeNumber {
	public static void main(String[] args) {
		int a = 45;
		int b = 80;
		int c = 60;
		
		int result = ((a>b) && (a>c)) ? a : (b>c) ? b : c;
		System.out.println("The Largest among three number is: "  +result);
	}

}
