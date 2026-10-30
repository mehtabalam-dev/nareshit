package encapsulationPrograms;

import java.util.Scanner;

public class StudentProfileManagement 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int rollNo = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		int age = sc.nextInt();
		double marks = sc.nextDouble();
		
		Student obj = new Student();
		obj.setRollNo(rollNo);
		obj.setName(name);
		obj.setAge(age);
		obj.setMarks(marks);
		obj.displayDetails();
	}
}
class Student 
{
	 private int rollNo;
	 private String name;
	 private int age;
	 private double marks;
	 
	 public int getRollNo()
	 {
		 return rollNo;
	 }
	 public void setRollNo(int rollNo)
	 {
		 if(rollNo<0)
		 {
			 this.rollNo = 0;
		 }
		 else
		 { 
			 this.rollNo = rollNo;
		 }
	 }
	 
	 public String getName()
	 {
		 return name;
	 }
	 public void setName(String name)
	 {
		 this.name = name;
	 }
	 
	 public int getAge()
	 {
		 return age;
	 }
	 public void setAge(int age)
	 {
		 if(age < 15 || age > 60)
		 {
			 this.age = 0;
		 }
		 else
		 {
			 this.age = age;
		 }
	 }
	 
	 public double getMarks()
	 {
		 return marks;
	 }
	 public void setMarks(double marks)
	 {
		 if(marks < 0 || marks > 100)
		 {
			 this.marks = 0;
		 }
		 else
		 {
			 this.marks = marks;
		 }
	 }
	 
	 
	 public void displayDetails()
	 {
		 System.out.println("Roll No : "+getRollNo());
		 System.out.println("Name : "+getName());
		 System.out.println("Age : "+getAge());
		 System.out.println("Marks : "+getMarks());
	 }
	 
	 
	 
	 
}