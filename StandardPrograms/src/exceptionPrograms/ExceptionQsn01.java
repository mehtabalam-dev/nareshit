package exceptionPrograms;

import java.util.Scanner;

public class ExceptionQsn01 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account holder's name, initial amount and withdrawal amount one by one");
		String accountHolderName = sc.nextLine();
		double balance = sc.nextDouble();
		double amount = sc.nextDouble();
		BankAccount obj = new BankAccount(accountHolderName, balance);
		try
		{
			obj.withdraw(amount);
		}
		catch(InsufficientBalanceException e)
		{
			System.err.println(e.getMessage());
		}
		finally
		{
			System.out.printf("Remaining Balance: %.2f",obj.getBalance());
		}
	}
}
class BankAccount
{
	private String accountHolder;
	private double balance;
	public BankAccount(String accountHolder, double balance) 
	{
		this.accountHolder = accountHolder;
		this.balance = balance;
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
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException
	{
		if(amount <= 0)
		{
			throw new InsufficientBalanceException("Invalid withdrawal amount");
		}
		else if(amount > balance)
		{
			throw new InsufficientBalanceException("Insufficient balance");
		}
		else
		{
			balance = balance - amount;
			System.out.println("Withdrawal successful");
		}
	}
	
}
class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String errorMessage)
	{
		super(errorMessage);
	}
}