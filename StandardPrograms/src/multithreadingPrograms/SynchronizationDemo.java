package multithreadingPrograms;

public class SynchronizationDemo
{
	public static void main(String[] args)
	{
		Whatsapp obj = new Whatsapp();
		Ramesh t1 = new Ramesh("Payal",obj);
		Suresh t2 = new Suresh("barsha", obj);
		t1.start();
		t2.start();
	}
}
class Ramesh extends Thread
{
	String name;
	Whatsapp obj;
	public Ramesh(String name,Whatsapp obj)
	{
		this.name = name;
		this.obj = obj;
	}
	public void run()
	{
		obj.sendMessage(name);
	}
}
class Suresh extends Thread
{
	String name;
	Whatsapp obj;
	public Suresh(String name,Whatsapp obj)
	{
		this.name = name;
		this.obj = obj;
	}
	public void run()
	{
		obj.sendMessage(name);
	}
}
class Whatsapp
{
	public synchronized void sendMessage(String name)
	{
		try
		{
			
			for(int i = 0; i <= 5; i++)
			{
				System.out.println(name+" : Good Morning bubu");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();;
		}
	}
}
