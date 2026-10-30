package multithreadingPrograms;

public class Deadlock02 
{
	public static void main(String[] args)   
	{
		MyRunnable7 r1 = new MyRunnable7(Thread.currentThread());
		Thread t1 = new Thread(r1);
//		t1.start();
		try {
			System.out.println("Main thread waits for himself to get terminated");
//			System.out.println("main thread waits for t1 thread to get terminated");
			Thread.currentThread().join();
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
class MyRunnable7 implements Runnable
{
	Thread mt;
	public MyRunnable7(Thread mt) 
	{
		this.mt = mt;
	}
	public void run()
	{
		try {
			System.out.println("t1 waits for main to get terminated");
			mt.join();
			for(int i = 101; i <=200; i++ )
			{
				System.out.println(i);
			}
			System.out.println("t1 got terminated");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
}
