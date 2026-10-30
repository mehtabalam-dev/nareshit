package inheritancePrograms;

public class Qsn02H {

}
class Employee01{
	public int id;
	public String name;
	public double baseSalary;
	
	public Employee01(int id, String name, double baseSalary) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public void display()
	{
		System.out.println("ID "+id);
	}
}
class Developer extends Employee1
{
	double bonus;
	
	public Developer(int id, String name, double baseSalary,double bonus) {
		super(id, name, baseSalary);
		this.bonus = bonus;
		
	}
	
	public void display()
	{
		super.display();
		System.out.println();
	}
	
	

	
}
