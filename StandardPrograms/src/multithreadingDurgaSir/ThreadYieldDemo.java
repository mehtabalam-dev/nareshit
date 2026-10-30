package multithreadingDurgaSir;

public class ThreadYieldDemo 
{
	public static void main(String[] args)
	{
		MyThreadYeild t = new MyThreadYeild();
		t.start();
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}
class MyThreadYeild extends Thread
{
	public void run()
	{
		for(int i = 0; i <= 10; i++)
		{
			Thread.yield();
			System.out.println("Child Thread");

		}
	}
}