package multithreadingPrograms;
/*
 * Bank Account Deposit Using Multiple Thread
 */
public class Qsn03
{
	public static void main(String[] args) throws InterruptedException
	{
		BankAccount obj = new BankAccount();
		CustumerOne t1 = new CustumerOne(obj);
		t1.setName("Hamza");
		CustumerTwo t2 = new CustumerTwo(obj);
		t2.setName("Yahya");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final balance is : "+obj.balance);
		
	}
}
class BankAccount
{
	public double balance = 1000;
	public synchronized void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println(Thread.currentThread().getName()+" Deposit of "+amount+" is done successfully");
	}
}
class CustumerOne extends Thread
{
	public BankAccount ba;

	public CustumerOne(BankAccount ba)
	{
		this.ba = ba;
	}
	public void run()
	{
		ba.deposit(500);
	}
}
class CustumerTwo extends Thread
{
	public BankAccount ba;

	public CustumerTwo(BankAccount ba)
	{
		this.ba = ba;
	}
	public void run()
	{
		ba.deposit(700);
	}
}