package methodsPart04;

public class ArmstrongNumber {
	public static void main(String[] args) {
		boolean result = armstrongNumber(153);
		System.out.println(result);
	}
	public static boolean armstrongNumber(int num) {
		int temp = num;
		int count = 0;
		while(temp!=0) {
			temp = temp / 10;
			count++;
		}
		temp = num;
		double sum = 0;
		while(temp!=0) {
			int ld = temp % 10;
			double power = Math.pow(ld,count);
			sum = sum + power;
			temp = temp / 10;
			
		}
		return sum == num;
		
	}

}
