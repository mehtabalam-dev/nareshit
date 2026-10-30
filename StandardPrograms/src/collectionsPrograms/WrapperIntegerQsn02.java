package collectionsPrograms;

public class WrapperIntegerQsn02 
{
	public static void main(String[] args) 
	{
        int a = 20;
        int b = 40;

        System.out.println(Integer.max(a, b));
        System.out.println(Integer.min(a, b));
        System.out.println(Integer.sum(a, b));
        
        
        /*
         * 	Integer.compare()
         * 	Static method
         * 	It returns:
			Condition										Return value
			First value is greater							Positive number (1)
			Both values are equal							0
			First value is smaller							Negative number (-1)
         */
        
        System.out.println(Integer.compare(20, 10));

        System.out.println(Integer.compare(10, 10));

        System.out.println(Integer.compare(5, 10));
        
        
        /*
         * compareTo()
         * 
         * 	Instance method.
			Called using an Integer object.
			Compares two Integer objects
         * 
         */
        Integer c = 20;
        Integer d = 10;
        System.out.println(c.compareTo(d));
        System.out.println(d.compareTo(c));
        System.out.println(c.compareTo(c));
        System.out.println(d.compareTo(d));
	}
}
