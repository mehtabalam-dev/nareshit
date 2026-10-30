package arrayPrograms;

public class Two2DArray 
{
	public static void main(String[] args)
	{
		int[][] arr = {{10,20,30},{40,50,60},{70,80,90}};
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = 0; j <= arr[i].length-1; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
