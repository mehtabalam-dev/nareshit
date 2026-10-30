package practicePatternPrograms;

import java.util.Scanner;

public class ZigZagNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int input = sc.nextInt();
		int number = 1;
		for(int i = 1; i<= input; i++) {
			if(i%2!=0) {
				for(int j = 1; j<= input; j++) {
		
					System.out.print(number+" ");
					number++;
				}
			}else {
				int start = number + input - 1;
				for(int z = 1; z<= input; z++) {
					System.out.print(start+" ");
					start--;
				}
				number+=input;
				
			}
			
			System.out.println();
		}
	}

}
