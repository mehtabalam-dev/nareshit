package basicOfJava;

import java.util.Scanner;

public class StudentDetails
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details full name, age, gender,college name, and cgpa :  ");
		String fullName = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String gender = sc.nextLine();
		String collegeName = sc.nextLine();
		double cgpa = sc.nextDouble(); 
		
		System.out.println("Student Details : ");
		System.out.println("Full Name of Student is : " + fullName);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		System.out.println("College Name : " + collegeName);
		System.out.println("CGPA : " + cgpa);
		
		
	}

}
