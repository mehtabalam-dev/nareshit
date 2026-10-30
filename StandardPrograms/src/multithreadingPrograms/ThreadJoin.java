package multithreadingPrograms;

public class ThreadJoin 
{
	public static void main(String[] args)   
	{
		MyRunnable4 r1 = new MyRunnable4(Thread.currentThread());
		Thread t1 = new Thread(r1);
		t1.start();
 			for(int i = 0; i <= 100; i++)
			{
				System.out.println(i);
			}
			System.out.println("main got terminated");
 
	}
}
class MyRunnable4 implements Runnable
{
	Thread mt;
	public MyRunnable4(Thread mt) 
	{
		this.mt = mt;
	}
	public void run()
	{
		
		try
		{
 
			mt.join();

 
			for(int i = 101; i <= 200; i++)
			{
				System.out.println(i);
			}
			System.out.println("t1 got terminated");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}