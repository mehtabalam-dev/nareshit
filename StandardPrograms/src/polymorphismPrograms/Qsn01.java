package polymorphismPrograms;
 
public class Qsn01 {
	public static void main(String[] args) {
		SalaryCalculator obj = new SalaryCalculator();
		
		
		System.out.println(obj.calculateSalary(30000));
		System.out.println(obj.calculateSalary(8, 1000));
		System.out.println(obj.calculateSalary(9000.0, 1000.0));
	}

}
class SalaryCalculator{
	
	public double calculateSalary(double monthlySalary) {
		return monthlySalary;
	}
	
	public double calculateSalary(int hour, double ratePerHour) {
		return hour * ratePerHour;
	}
	
	public double calculateSalary(double fixedAmount, double bonus) {
		return fixedAmount+bonus;
	}
	
}
