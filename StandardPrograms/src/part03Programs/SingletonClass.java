package part03Programs;

public class SingletonClass
{
	public static void main(String[] args) 
	{
		Student std1 = Student.givemeAnObject(10, 20);
		System.out.println(std1);
		Student std2 = Student.givemeAnObject(30, 40);
		System.out.println(std2);
		Student std3 = Student.givemeAnObject(50, 60);
		System.out.println(std3);
		
	}
}
class Student 
{
	private int i;
	private int j;
	private static Student singletonObject = null;
	public Student(int i, int j) 
	{
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return "Student [i="+ i + ", j="+ j + "]";
	}
	public static Student givemeAnObject(int i, int j)
	{
		if(singletonObject == null)
		{
			singletonObject = new Student(i, j);
		}
		return singletonObject;
	}
	
}
