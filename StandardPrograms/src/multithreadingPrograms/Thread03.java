package multithreadingPrograms;

public class Thread03 
{
	public static void main(String[] args)   
	{
		MyRunnable3 r1 = new MyRunnable3(Thread.currentThread());
		Thread t1 = new Thread(r1);
		t1.start();
//		System.out.println("main thread waits for t1 thread to get terminated");
//		try {
//			t1.join();
			for(int i = 0; i <= 100; i++)
			{
				System.out.println(i);
			}
			System.out.println("main got terminated");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//--------
//		System.out.println("Main thread waits for himself to get terminated");
//		Thread.currentThread().join();
	}
}
class MyRunnable3 implements Runnable
{
	Thread mt;
	public MyRunnable3(Thread mt) 
	{
		this.mt = mt;
	}
	public void run()
	{
		
		try
		{
//			System.out.println("t1 waits for main to get terminated");
			mt.join();

//			System.out.println("");
//			mt.join();
//			Thread.currentThread().join();
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