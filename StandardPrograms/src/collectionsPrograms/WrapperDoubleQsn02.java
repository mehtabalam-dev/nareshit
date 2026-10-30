package collectionsPrograms;

import java.util.Scanner;

public class WrapperDoubleQsn02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		Double x = Double.valueOf(a);
		Double y = Double.valueOf(b);
		System.out.println(x.compareTo(y));
		double p = x.doubleValue();
		double q = y.doubleValue();
		System.out.println(p);
		System.out.println(q);
        double k = 0.0 / 0.0;
        System.out.println(k);
        double m = 10.0 / 0.0;
        System.out.println(m);
        System.out.println(Double.isNaN(k));
        System.out.println(Double.isInfinite(m));
		
	}
}
