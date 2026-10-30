package abstractionPrograms;

import java.util.Scanner;

public class Qsn04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();
		Employee emp = FactoryClass.getImplementationObject(choice);
		System.out.println("Bonus : "+emp.calculateBonus(salary));
		
	}

}
class FactoryClass{
	public static Employee getImplementationObject(int choice) {
		Employee emp = null;
		switch(choice) {
		case -1 -> emp = new PermanentEmployee();
		case -2 -> emp = new ContarctEmployee();
		}
		return emp;
	}
}
abstract class Employee{
	public abstract double calculateBonus(double salary);
}
class PermanentEmployee extends Employee{

	@Override
	public double calculateBonus(double salary) {
		double bonus = (salary * 10/100);
		return bonus;
	}
	
}
class ContarctEmployee extends Employee{

	@Override
	public double calculateBonus(double salary) {
		double bonus = (salary * 5/100);
		return bonus;
	}
	
}
