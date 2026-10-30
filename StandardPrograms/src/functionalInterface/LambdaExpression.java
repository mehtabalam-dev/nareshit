package functionalInterface;

public class LambdaExpression 
{
	public static void main(String[] args)
	{
		Student s = new Student()
				{
					public void writeNotes()
					{
						System.out.println("Yahya writting notes...!!");
					}
					public void study()
					{
						System.out.println("Yahya is studying..!!");
					}
 
				};
				s.writeNotes();
				s.study();
	}
}
interface Student
{
	void writeNotes();
	void study();
}