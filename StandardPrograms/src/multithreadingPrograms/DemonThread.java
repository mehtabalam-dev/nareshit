package multithreadingPrograms;

public class DemonThread
{
	public static void main(String[] args) 
	{
		MyThreadDemon t = new MyThreadDemon();
		t.setDaemon(true);
		t.start();
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Main thread : "+i);
		}
	}
}
class MyThreadDemon extends Thread
{
	public void run()
	{
		for(int i = 100; i <= 1000; i++)
		{
			System.out.println("t thread    : "+i);
		}
	}
}
