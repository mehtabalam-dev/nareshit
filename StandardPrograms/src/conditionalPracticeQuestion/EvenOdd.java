package conditionalPracticeQuestion;

public class EvenOdd {
	public static void main(String[] args) {
		int a = 17;
		String result = (a%2==0) ? "Even Number" : "Odd Number";
//		String result = (a%2!=0)? "Odd Number" : "Even Number";
		System.out.println(result);
	}

}
