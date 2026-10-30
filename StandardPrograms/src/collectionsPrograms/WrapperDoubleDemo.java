package collectionsPrograms;

public class WrapperDoubleDemo 
{
	public static void main(String[] args)
	{
		 // valueOf()
        double a = 25.5;
        Double obj = Double.valueOf(a);
        System.out.println("valueOf: " + obj);

        // parseDouble()
        String str = "45.75";
        double b = Double.parseDouble(str);
        System.out.println("parseDouble: " + b);

        // doubleValue()
        double c = obj.doubleValue();
        System.out.println("doubleValue: " + c);

        // isNaN()
        double x = 0.0 / 0.0;
        System.out.println("Is NaN: " + Double.isNaN(x));

        // isInfinite()
        double y = 10.0 / 0.0;
        System.out.println("Is Infinite: " + Double.isInfinite(y));

        // compareTo()
        Double n1 = 78.5;
        Double n2 = 30.5;
        System.out.println("CompareTo: " + n1.compareTo(n2));
	}
}
