package functionalInterface;

public class ThreadLambdaExpression
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(() ->
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println(Thread.currentThread().getName()+" = "+i);
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
		});
		Thread t2 = new Thread(()-> 
		{
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i = 11; i <= 20; i++)
			{
				System.out.println(Thread.currentThread().getName()+" = "+i);
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
		});
		t1.start();
		t2.start();
	}
}
