package multithreadingPrograms;

public class ThreadDemo02
{
	public static void main(String[] args)
	{
		MyThread1 t1 = new MyThread1();
 
		t1.start();
		MyThread2 t2 = new MyThread2();
 
		t2.start();
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
		}
	}
}
class MyThread1 extends Thread
{
	public void run()
	{
		for(int i = 101; i <= 200; i++)
		{
			System.out.println(i);
		}
	}
}

class MyThread2 extends Thread
{
	public void run()
	{
		for(int i = 201; i <= 300; i++)
		{
			System.out.println(i);
		}
	}
}
 


