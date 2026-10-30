package arrayPrograms;

public class MoveZeroToEnd 
{
	public static void main(String[] args) {
	      int[] arr = {5,0,2,0,9,0,1};
	      int index = 0;
	      //non-zero element
	      for(int i = 0; i < arr.length; i++)
	      {
	        if(arr[i]!=0)
	        {
	          arr[index++]=arr[i];
	        }
	      }

	      for(int e : arr)
	      {
	        System.out.print(e+" ");
	      // zero element
	      }


	      
	      while(index<arr.length)
	      {
	        arr[index++]=0;
	      }
	      IO.println();
	      for(int e : arr)
	      {
	        System.out.print(e+" ");
	      }
	    }
}
