package multithreadingPrograms;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PreventingDeadLock
{
	public static void main(String[] args) 
	{
		Lock obj = new ReentrantLock();
		MyThreadTen t1 = new  MyThreadTen(obj);
		MyThreadTen t2 = new  MyThreadTen(obj);
		t1.start();
		t2.start();
	}
}
class MyThreadTen extends Thread
{
	public Lock l;
	
	public MyThreadTen(Lock l)
	{
		this.l = l;
	}
	
	public void run()
	{
		
		try {
			if(l.tryLock(7,TimeUnit.SECONDS))
			{
				try
				{
//					l.tryLock();
					System.out.println(Thread.currentThread().getName()+" is acquired the lock");
					for(int i = 1; i <= 10; i++)
					{
						System.out.println(Thread.currentThread().getName()+" : "+i);
						Thread.sleep(1000);
					}
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
				finally
				{
					System.out.println(Thread.currentThread().getName()+" is released the lock");
					l.unlock();
				}
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" counldn't acquire the lock");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
