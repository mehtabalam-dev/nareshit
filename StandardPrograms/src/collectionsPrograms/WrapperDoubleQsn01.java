package collectionsPrograms;

public class WrapperDoubleQsn01 
{
	public static void main(String[] args)
	{
        double a = 25.5;

        Double obj = Double.valueOf(a);

        System.out.println(obj);
        
        String str = "45.75";

        double value = Double.parseDouble(str);

        System.out.println(value);
        
        Double obj1 = Double.valueOf(99.50);

        double value1 = obj1.doubleValue();

        System.out.println(value1);
        
        
        double x = 0.0 / 0.0;

        System.out.println(x);
        
        
        double y = 0.0 / 0.0;
        double z = 10.0 / 2.0;

        System.out.println(Double.isNaN(y));
        System.out.println(Double.isNaN(z));
        
        
        
        double q = 10.0 / 0.0;
        double w = -10.0 / 0.0;
        double e = 10.0 / 2.0;

        System.out.println("a = " + q);
        System.out.println("b = " + w);
        System.out.println("c = " + e);

        System.out.println();

        System.out.println(Double.isInfinite(q));
        System.out.println(Double.isInfinite(w));
        System.out.println(Double.isInfinite(e));
	}
}
