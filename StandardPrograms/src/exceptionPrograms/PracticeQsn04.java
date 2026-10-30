package exceptionPrograms;

import java.util.Scanner;

public class PracticeQsn04 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Exception with description: ");
		double balance = sc.nextDouble();
		double amount = sc.nextDouble();
		Bank acc = new Bank(balance);
		try
		{
			acc.withdraw(amount);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println("Attempted to withdraw "+ amount + "--insufficient funds");
		}
	}
}
class Bank
{
	private double balance;
	
	public Bank(double initialBalance)
	{
		this.balance = initialBalance;
	}
	public void withdraw(double amount) throws InsufficientFundsException
	{
		if(amount > balance)
		{
			throw new InsufficientFundsException("Attempted to withdraw "+ amount + "--insufficient funds");
		}
		
		balance = balance - amount;
		System.out.println("New Balance: "+balance);
	}
}
class InsufficientFundsException extends Exception
{
 
	public InsufficientFundsException(String errorMessage)
	{
		super(errorMessage);
	 
	}
 
}
