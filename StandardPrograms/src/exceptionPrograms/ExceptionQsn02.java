package exceptionPrograms;

import java.util.Scanner;

public class ExceptionQsn02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String  studentName = sc.nextLine();
		int marks [] = new int[5];
		for(int i = 0; i < marks.length; i++)
		{
			marks[i] = sc.nextInt();
		}
		Student obj  = new Student(studentName,marks);
		try
		{
			double avg = obj.calculateAverage();
			System.out.println("Student: "+obj.getStudentName());
			System.out.printf("Average Marks: %.2f",avg);
		}
		catch(InvalidMarksException e )
		{
			System.out.println(e.getMessage());
		}
	}

}
class Student
{
	private String studentName;
	private int marks[];
	
	public Student(String studentName,int arr[])
	{
		this.studentName = studentName;
		this.marks = arr;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public double calculateAverage() throws InvalidMarksException
	{
		int sum = 0;
		for(int i = 0; i < marks.length; i++)
		{
			if(marks[i] < 0 || marks[i] > 100)
			{
				throw new InvalidMarksException("Invalid marks found");
			}
			sum = sum + marks[i];
		}
		double avg = sum / marks.length;
		return avg;
	}
}
class InvalidMarksException extends Exception
{
	public InvalidMarksException(String errorMessage)
	{
		super(errorMessage);
	}
}
