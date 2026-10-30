package conditionalPracticeQuestion;

public class LeapYear {
	public static void main(String[] args) {
		
		int year = 1927;
		
		//  year%4==0
		String result  = ((year % 4 ==0 && year%100!=0)||year%400==0) ? "Leap Year" : "Not A Leap Year";
	
	   System.out.println(result);
	}

}
