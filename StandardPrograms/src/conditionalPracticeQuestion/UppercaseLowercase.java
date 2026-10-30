package conditionalPracticeQuestion;

public class UppercaseLowercase {
	public static void main(String[] args) {
		char ch = 'M';
		
	String	result = ((ch >= ('A') && ch <= ('Z'))? "Uppercase" : ((ch >= 'a' && ch <= 'z' )) ? "Lowercase" : "Not A Alphabet!");
	System.out.println(result);
	}

}
