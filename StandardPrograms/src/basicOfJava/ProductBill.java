package basicOfJava;
import java.util.Scanner;
public class ProductBill 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter quantity and price one by one: ");
		int quantity = sc.nextInt();
		double price = sc.nextDouble();
		double total_bill = quantity*price;
		double gst = 0;
		
		if(quantity <0 || price <0)
		{
			System.out.println("Invalid Input");
			return;
		}
		else
		{
			if(total_bill<500)
			{
				gst = (total_bill*5)/100;
			}
			else
			{
				gst = (total_bill*10)/100;
			}
			System.out.println("Total Bill = " +total_bill);
			System.out.println("GST = " +gst );
			System.out.println("Final Bill " +(total_bill+gst));
		}
	}
}
