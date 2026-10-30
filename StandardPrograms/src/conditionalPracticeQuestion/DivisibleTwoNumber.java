package conditionalPracticeQuestion;

public class DivisibleTwoNumber {
	public static void main(String[] args) {
		
		int number = 55;
		
		String result = ((number % 5==0) && (number % 11 ==0 )) ? "Divisible by Both 5 and 11" : "Not divisible by 5 and 11";
		System.out.println(result);
	}

}
