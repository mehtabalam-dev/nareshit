
package multithreadingPrograms;

public class NotifyExample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyThread07 t = new MyThread07();
		t.start();
		System.out.println("main thread waits for t thread");
		synchronized (t) {
			t.wait();
		}
		for(int i = 0; i <= 100; i++)
		{
			System.out.println(i);
		}
		
	}
}
class MyThread07 extends Thread
{
	public void run()
	{
		for(int i =101; i <= 200; i++)
		{
			System.out.println(i);
			if(i==150)
			{
				synchronized (this) {
					System.out.println("t thread notifies the waiting thread(main thread)");
					notify();
				}
			}
		}
	}
}