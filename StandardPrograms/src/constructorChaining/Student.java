package constructorChaining;

public class Student {
	public String name;
	public int studentId;
	public int age;
	public double percentage;
	public String city;
	public Student(String name,int studentId,int age,double percentage) {
		this.name = name;
		this.studentId = studentId;
		this.age = age;
		this.percentage = percentage;
		
	}
	public Student(String name,int studentId,int age,double percentage,String city) {
		this(name,studentId,age,percentage);
		this.city = city;
		
	}
	public void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Student ID : "+studentId);
		System.out.println("Age : "+age);
		System.out.println("Percentage : "+percentage);
		System.out.println("City : "+city);
	}
	public static void main(String[] args) {
		Student s1 = new Student("Mehtab", 01, 21, 79);
		Student s2 = new Student("Shams",02 , 8, 95, "Kushinagar");
		s1.displayDetails();
		System.out.println("===========================");
		s2.displayDetails();

	}
	

}
