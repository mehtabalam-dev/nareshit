package HasArelationshipPrograms;

public class AssociationDemo {
	public static void main(String[] args) {
		Pen pen = new Pen("Flair","Blue","Ball Pen",50);
		Student std = new Student("ABC",19,101,pen);
		std.displayDetails();
	}

}
class Pen{
	String brand;
	String color;
	String type;
	double price;
	public Pen(String brand, String color, String type, double price) {
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Brand name : "+brand);
		System.out.println("Color      : "+color);
		System.out.println("Type       : "+type);
		System.out.println("Price      : "+price);
	}
	
	
}
class Student{
	String name;
	int age;
	int rollNumber;
	Pen pen;
	public Student(String name, int age, int rollNumber, Pen pen) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.pen = pen;
	}
	
	public void displayDetails() {
		System.out.println("Student Name : "+name);
		System.out.println("Age          :"+age);
		System.out.println("Roll Number  : "+rollNumber);
		System.out.println("Pen details  :");
		pen.displayDetails();
	}
	
	
	
}






















