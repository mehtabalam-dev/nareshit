package collectionsPrograms;

import java.util.Scanner;
import java.util.Vector;

public class VectorPracticeQsn01 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Vector<Student> v = new Vector<>();
		System.out.println("Enter number of students : ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Enter roll number,name and marks of a student : "+i);
			int rollNumber = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double marks = sc.nextDouble();
			Student obj = new Student(rollNumber,name,marks);
			v.add(obj);
		}
		for(Student e : v)
		{
			e.displayDetails();
			System.out.println();
		}
	}
}
class Student
{
	public int rollNumber;
	public String studentName;
	public double marks;
	
	public Student(int rollNumber,String studentName,double marks)
	{
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	public void displayDetails()
	{
		System.out.println("Roll Numneber : "+rollNumber);
		System.out.println("Student Name  : "+studentName);
		System.out.println("Marks         :  "+marks);
	}
}
