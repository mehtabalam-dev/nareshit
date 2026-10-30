package functionalInterface;

import java.util.function.Supplier;

public class SupplierLambdaExpression
{
	public static void main(String[] args) 
	{
//        Supplier<String> s = () -> "Hi";
//        System.out.print(s.get());
		
		Supplier<Integer> s = () -> 100;
		System.out.println(s.get());
	}
}
