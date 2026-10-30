package collectionsPrograms;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableQsn02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StudentManagement sm = new StudentManagement();
		System.out.println("Enter number of students : ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter student ID, name and marks "+ (i+1));
			int studentId = Integer.parseInt(sc.nextLine());
			String studentname = sc.nextLine();
			double marks = Double.parseDouble(sc.nextLine());
			sm.addStudent(new Student01(studentId, studentname, marks));
		}
		System.out.println("Enter student ID to display the details : ");
		int id = Integer.parseInt(sc.nextLine());
		sm.displayStudent(id);
	}
}
class StudentManagement
{
	public Hashtable<Integer, Student01> table = new Hashtable<Integer, Student01>();

//	public StudentManagement(Hashtable<Integer, Student> table) 
//	{
//		this.table = table;
//	}
	public void addStudent(Student01 std)
	{
		table.put(std.studentId, std);
		System.out.println(std.studentName + " is added successfully");
	}
	public void displayStudent(int id)
	{
		if(table.containsKey(id))
		{
			System.out.println(table.get(id));
		}
		else
		{
			System.out.println("Student not found");
		}
	}
}

class Student01
{
	public int studentId;
	public String studentName;
	public double marks;
	public Student01(int studentId, String studentName, double marks)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	@Override
	public String toString()
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + 
				", marks=" + marks + "]";
	}
	
	
}