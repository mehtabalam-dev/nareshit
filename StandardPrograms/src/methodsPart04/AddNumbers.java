package methodsPart04;

public class AddNumbers {
	public static void main(String[] args) {
		int result = addNumbers(5);
		System.out.println("The sum is: "+result);
	}
	public static int addNumbers(int  num) {
		int sum = 0;
		for(int i = 1; i<= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
