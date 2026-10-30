package encapsulationPrograms;

public class Qsn02 {

}
class Employee{
	private int empId;
	private String empName;
	private double empSalary;
	
	 	
	public Employee(int empId, String empName, double empSalary) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	


	public int getEmpId() {
		return empId;
	}




	public void setEmpId(int empId) {
		this.empId = empId;
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public double getEmpSalary() {
		return empSalary;
	}




	public void setEmpSalary(double empSalary) {
		if(empSalary<0) {
			System.out.println("Invalid Salary");
		}else {
			
			this.empSalary = empSalary;
		}
	}




	public void displayDetails() {
		System.out.println("Employee ID: " +empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+empSalary);
	}
	
}
class HRDepartment extends Employee{

	public HRDepartment(int empId, String empName, double empSalary) {
		super(empId, empName, empSalary);
		 
	}
	
	
	
}
