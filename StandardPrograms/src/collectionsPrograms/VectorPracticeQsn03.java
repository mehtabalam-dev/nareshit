package collectionsPrograms;

import java.util.Scanner;
import java.util.Vector;

public class VectorPracticeQsn03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Vector<BankAccount> v = new Vector<>();
		System.out.println("Enter the number of bank accounts : ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter account number, account holder name, and balance. "+(i+1));
			int accountNumber = Integer.parseInt(sc.nextLine());
			String accountHolderName = sc.nextLine();
			double balance = Double.parseDouble(sc.nextLine());
			BankAccount obj = new BankAccount(accountNumber, accountHolderName, balance);
			v.add(obj);
		}
		BankAccount firstAccount = v.getFirst();
		firstAccount.deposit(2000);
		firstAccount.withdraw(500);
		for(BankAccount e : v)
		{
			e.displayAccount();
			System.out.println("------------------------------------------------");
		}
	}
}
class BankAccount
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(int accountNumber,String accountHolderName,double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		if(amount >= 0)
		{
			System.out.println("Amount of "+amount+" is deposited successfully..!!");
			balance = balance + amount;
		}
		else
		{
			System.out.println("Invalid deposit amount");
		}
	}
	public void withdraw(double amount)
	{
		if(amount >= 0 && amount <= balance)
		{
			System.out.println("Amount of "+amount+" is withdrawn succesfully..!!");
			balance = balance - amount;
		}
		else
		{
			System.out.println("Invalid withdraw amount");
		}
	}
	public void displayAccount()
	{
		System.out.println("Account Number       :  "+accountNumber);
		System.out.println("Account Holder Name  :  "+accountHolderName);
		System.out.println("Balance              :  "+balance);
	}
}