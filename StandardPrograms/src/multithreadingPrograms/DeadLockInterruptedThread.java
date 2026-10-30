package multithreadingPrograms;

public class DeadLockInterruptedThread 
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyThread08 t = new MyThread08();
		t.start();
		Thread.sleep(5000);
		System.out.println("main thread waits for t thread");
		synchronized(t)
		{
			t.wait();
		}
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
	}
}
class MyThread08 extends Thread
{
	public void run()
	{
		for(int i =101; i <= 110; i++)
		{
			System.out.println(i);
			if(i==105)
			{
				synchronized (this) 
				{
					System.out.println("t thread notifies the waiting thread(main thread)");
					notify();
				}
			}
		}
	}
}