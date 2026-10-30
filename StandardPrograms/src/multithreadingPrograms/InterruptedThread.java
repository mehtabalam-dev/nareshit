package multithreadingPrograms;

public class InterruptedThread 
{
	public static void main(String[] args) 
	{
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		for(int i = 0; i <= 100; i++)
		{
			System.out.println(i);
		}
	}
}
class MyThread extends Thread
{
	public void run()
	{	
		try
		{
			for(int i = 101; i <= 200; i++)
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("thread t1 got interrupted ");
		}
	}
}
