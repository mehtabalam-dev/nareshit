package multithreadingPrograms;
/*
 * Student Details Using Two Thread
 */
public class Qsn02
{
	public static void main(String[] args)
	{
		Student obj = new Student(101, "Hamza", "Java");
		StudentDetailsThread t1 = new StudentDetailsThread(obj);
		CourseDetailsThread t2 = new CourseDetailsThread(obj);
		t1.start();
		t2.start();
	}
}
class Student
{
	public int studentId;
	public String studentName;
	public String course;
	
	public Student(int studentId,String studentName,String course)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}
}
class StudentDetailsThread extends Thread
{
	public Student s;

	public StudentDetailsThread(Student s)
	{
		this.s = s;
	}
	public void run()
	{
		System.out.println("Student Id   : "+s.studentId);
		System.out.println("Student Name : "+s.studentName);
	}
}
class CourseDetailsThread extends Thread
{
	public Student s;

	public CourseDetailsThread(Student s)
	{
		this.s = s;
	}
	public void run()
	{
		System.out.println("Course Name   : "+s.course);
	}
} 








