package multithreadingPrograms;
/*
 * Display number using two thread
 */
public class Qsn01
{
	public static void main(String[] args)
	{
		ThreadOne t1 = new ThreadOne();
		t1.setName("Thread one");
		ThreadTwo t2 = new ThreadTwo();
		t2.setName("Thread Two");
		t1.start();
		t2.start();
	}
}
class ThreadOne extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
class ThreadTwo extends Thread
{
	public void run()
	{
		for(int i = 6; i <= 10; i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}