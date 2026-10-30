package classAndObject;

import java.util.Scanner;

public class Qsn02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountHolderName, accountNumber and balance to create the account");
		String accountHolderName = sc.nextLine();
		String accountNumber = sc.nextLine();
		double price = sc.nextDouble();
		BankAccount acc1 = new BankAccount(accountHolderName, accountNumber, price);
		acc1.deposit(500);
		acc1.withdraw(1000);
		acc1.displayBalance();
		
	}

}
class BankAccount{
	//Step-01 : declare static and non static variables.
	
	public String accountHolderName;
	public String accountNumber;
	public double balance;
	
	//Step-02 :  Initialize non static variables with constructor.
	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		 
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	} 
	//Step-03 : write any methods required.
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit of "+amount+" is done successfully...!!!");
	}
	
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient balance..!!");
		}else {
			balance = balance - amount;
			System.out.println("Amount of "+amount+" is deducted successfully...!!!");
		}
	}
	
	public void displayBalance() {
		System.out.println("Current balance is : "+balance);
	}
	
	
}