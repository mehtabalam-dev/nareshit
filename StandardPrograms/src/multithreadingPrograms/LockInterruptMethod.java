package multithreadingPrograms;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockInterruptMethod
{
	public static void main(String[] args) 
	{
		Lock obj = new ReentrantLock();
		MyThreadI t1 = new  MyThreadI(obj);
		MyThreadI t2 = new  MyThreadI(obj);
		t1.start();
		t2.start();
		try
		{
			System.out.println("Main waits for 5 seconds");
			Thread.sleep(5000);
//			t2.interrupt();
			Thread.State t1State = t1.getState();
			if(t1State==Thread.State.WAITING)
			{
				t1.interrupt();
			}
			else
			{
				t2.interrupt();
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("After 5 sec main interrupted the waiting t2 thread.");
		}
	}
}
class MyThreadI extends Thread
{
	public Lock l;
	
	public MyThreadI(Lock l)
	{
		this.l = l;
	}
	
	public void run()
	{
		try
		{
			l.lockInterruptibly();
			System.out.println(getName()+" is acquired the lock");
			for(int i = 0; i <= 10; i++)
			{
				System.out.println(getName()+" : "+i);
				Thread.sleep(1000);
			}
			System.out.println(getName()+" is released the lock");
			l.unlock();
		}
		catch(InterruptedException e)
		{
			System.out.println(getName()+" is interrupted..!!!");
		}
	}
}

