package forLoopPrograms;

public class PrimeNumberInRange
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int n = 1; n <= 100; n++)
		{
			
			for(int i = 1; i <= n; i++)
			{
				if(n % i == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(n);
			}
			
			count =0;
		}
	 
		
	}
}
