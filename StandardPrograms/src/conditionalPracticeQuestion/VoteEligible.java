package conditionalPracticeQuestion;

public class VoteEligible {
	public static void main(String[] args) {
		
		int age = 19;
		
		String result = (age >= 18)? "Eligible to Vote" : "Not Eligible";
		System.out.println(result);
	}

}
