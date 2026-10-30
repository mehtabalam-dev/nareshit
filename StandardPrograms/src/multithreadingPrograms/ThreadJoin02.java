package multithreadingPrograms;

public class ThreadJoin02 
{
	public static void main(String[] args)   
	{
		MyRunnable5 r1 = new MyRunnable5(Thread.currentThread());
		Thread t1 = new Thread(r1);
		t1.start();
		try {
			t1.join();
			for(int i = 0; i <= 100; i++)
			{
				System.out.println(i);
			}
			System.out.println("main got terminated");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
}
class MyRunnable5 implements Runnable
{
	Thread mt;
	public MyRunnable5(Thread mt) 
	{
		this.mt = mt;
	}
	public void run()
	{
		for(int i = 101; i <=200; i++ )
		{
			System.out.println(i);
		}
		System.out.println("t1 got terminated");
 
	}
}
