package multithreadingPrograms;
/*
 * synchronized 
 * 
 * non-synchronized
 * class level lock
 * object level lock
 * non static method --> object level lock
 * static method    --> class level lock
 * 
 * object level   ---> synchronized(this)
 * class level   ---> synchronized(className.class)
 */
public class LevelsOfLock
{
	public static void main(String[] args) 
	{
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		ThreadX t1 = new ThreadX(obj1);
		ThreadY t2 = new ThreadY(obj2);
		t1.setName("Thread X");
		t2.setName("Thread Y");
		t1.start();
		t2.start();
		
	}
}
class ThreadX extends Thread
{
	public Employee emp;

	public ThreadX(Employee emp) 
	{
 
		this.emp = emp;
	}
	public void run()
	{
		emp.demo();
	}
}
class ThreadY extends Thread
{
	public Employee emp;

	public ThreadY(Employee emp) 
	{
 
		this.emp = emp;
	}
	public void run()
	{
		emp.demo();
	}
}
class Employee
{
	public synchronized void demo()
	{
		try
		{
			for(int i = 0; i <= 5; i++)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(1000);
			}
			synchronized(Employee.class)
			{
				
				for(int i = 21; i <= 25; i++)
				{
					System.out.println(Thread.currentThread().getName()+" : "+i);
					Thread.sleep(1000);
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	public synchronized void fast()
	{
		try
		{
			for(int i = 101; i <= 105; i++)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}