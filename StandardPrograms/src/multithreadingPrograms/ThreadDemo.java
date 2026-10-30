package multithreadingPrograms;

public class ThreadDemo
{
	public static void main(String[] args)
	{
		MyRunnable1 r1 = new MyRunnable1();
		Thread t1 = new Thread(r1);
		t1.setPriority(10);
		t1.start();
//		MyRunnable2 r2 = new MyRunnable2();
//		Thread t2 = new Thread(r2);
//		t2.start();
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
		}
	}
}
class MyRunnable1 implements Runnable
{
	public void run()
	{
		for(int i = 101; i <= 200; i++)
		{
			System.out.println(i);
		}
	}
}

//class MyRunnable2 implements Runnable
//{
//	public void run()
//	{
//		for(int i = 201; i <= 300; i++)
//		{
//			System.out.println(i);
//		}
//	}
//}



