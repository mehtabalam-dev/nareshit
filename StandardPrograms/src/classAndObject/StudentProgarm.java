package classAndObject;

import java.util.Scanner;

public class StudentProgarm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		Student01 s = new Student01(name,age);
		s.displayDetails();
	}

}
class Student01{
	String name;
	int age;
	
	public Student01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
		System.out.println("Student Details : ");
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
	}
}
