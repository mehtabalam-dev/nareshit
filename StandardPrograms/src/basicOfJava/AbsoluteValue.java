package basicOfJava;

import java.util.Scanner;

public class AbsoluteValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int absoluteValue = sc.nextInt();
		
		if (absoluteValue < 0) 
		{
			absoluteValue = absoluteValue* -1;
		}
		
		
		Test ts = new Test();
		
		System.out.println(ts.data);
		System.out.println("Absolute Value is : " + absoluteValue);
	}

}
