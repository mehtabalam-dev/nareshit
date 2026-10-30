package encapsulationPrograms;

import java.util.Scanner;

public class BankAccountDetails 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account NUmber:");
		long accountNumber = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the account Holder:");
		String accountHolder = sc.nextLine();
		System.out.println("Enter the amount:");
	    double amount=sc.nextDouble();
		
		BankAccount01 obj1 = new BankAccount01();
		obj1.setAccountNumber(accountNumber);
		obj1.setAccountHolder(accountHolder);
		obj1.deposit(amount);
		System.out.println("============Test case1 =================");
		obj1.displayDetails();
		
		System.out.println();
		System.out.println("=================== * ==================");
		System.out.println("Enter the account Number:");
		long accountNumber1 = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the account Holder:");
		String accountHolder1 = sc.nextLine();
		System.out.println("Enter the account amount1:");
	    double amount1=sc.nextDouble();
	    System.out.println("Enter the account amount2:");
	    double amount2=sc.nextDouble();
	    System.out.println();
		System.out.println("============Test case2 =================");
		BankAccount01 obj2 = new BankAccount01();
		obj2.setAccountNumber(accountNumber);
		obj2.setAccountHolder(accountHolder);
		obj2.deposit(amount1);
		obj2.deposit(amount2);
		obj2.displayDetails();
		System.out.println("=================== * ==================");
		
		
	}
}
class BankAccount01
{
	private long accountNumber;
	private String accountHolder;
	private double balance;
	
	public long getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber)
	{
		if(accountNumber<=0)
		{
			this.accountNumber = 0;
		}
		else
		{
			this.accountNumber = accountNumber;
		}
		
	}
	
	public String getAccountHolder()
	{
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder)
	{
		this.accountHolder = accountHolder;
	}
	
	public double getBalance()
	{
		return balance;
	}
//	public void setBalance(double balance)
//	{
//		this.balance = balance;
//	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			this.balance += amount;
			System.out.println("Balance : "+getBalance());
		}
		 
	}
	
	public void displayDetails() 
	{
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder : "+accountHolder);
		System.out.println("Balance : "+balance);
 
	}
}
