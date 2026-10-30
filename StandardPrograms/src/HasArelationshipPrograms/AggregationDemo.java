package HasArelationshipPrograms;

public class AggregationDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer("ABC","Saving",4000);
		Customer c2 = new Customer("MNO","Current",10000);
		Customer c3 = new Customer("XYZ","Fixed deposit",50000);
		Bank b = new Bank("HDFC", "HYDERABAD", c1, c2, c3);
		b.displayDetails();
	}

}
class Bank{
	String name;
	String place;
	Customer c1;
	Customer c2;
	Customer c3;
	public Bank(String name, String place, Customer c1, Customer c2, Customer c3) {
		this.name = name;
		this.place = place;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	
	public void displayDetails() {
		System.out.println("Bank name : "+name);
		System.out.println("Bank Place: "+place);
		System.out.println("-------------------------------------");
		System.out.println("Customer 1 details :");
		c1.displayDetails();
		System.out.println("-------------------------------------");
		System.out.println("Customer 2 details : ");
		c2.displayDetails();
		System.out.println("-------------------------------------");
		System.out.println("Customer 3 details : ");
		c3.displayDetails();
	}
	
	
	
}
class Customer{
	String name;
	String accType;
	double balance;
	public Customer(String name, String accType, double balance) {
		this.name = name;
		this.accType = accType;
		this.balance = balance;
	}
	
	public void displayDetails() {
		System.out.println("Customer Name : "+name);
		System.out.println("Acccount Type : "+accType);
		System.out.println("Balance       : "+balance);
	}
	
}
