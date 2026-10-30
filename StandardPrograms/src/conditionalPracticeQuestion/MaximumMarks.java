package conditionalPracticeQuestion;

public class MaximumMarks {
	public static void main(String[] args) {
		int student1 = 82;
		int student2 = 76;
		int student3 = 91;
		
		int result = ((student1 > student2) && (student1 > student3)) ? student1 : ((student2 > student3)? student2 : student3);
		System.out.println(result);
	}

}
