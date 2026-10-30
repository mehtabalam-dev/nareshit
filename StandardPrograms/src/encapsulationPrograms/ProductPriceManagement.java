package encapsulationPrograms;

import java.util.Scanner;

public class ProductPriceManagement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int productId = sc.nextInt();
		sc.nextLine();
		String productName = sc.nextLine(); 
		double price = sc.nextDouble();
		double percentage = sc.nextDouble();
		Product obj = new Product();
		obj.setProductId(productId);
		obj.setProductName(productName);
		obj.setPrice(price);
		obj.applyDiscount(percentage);
		obj.displayDetails();
	}
}
class Product
{
	private int productId;
	private String productName;
	private double price;
	
	public int getProductId()
	{
		return productId;
	}
	public void setProductId(int productId)
	{
		if(productId>0)
		{
			this.productId = productId;			
		}
		else
		{
			this.productId = 0;
		}
	}
	
	public String getProductName()
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		if(price >=0)
		{
			this.price = price;
		}
		else
		{
			this.price = 0;
		}
	}
	
	public double applyDiscount(double percentage)
	{
		if(percentage <0 || percentage >100)
		{
			return price;
		}
		double discountAmount = (price * percentage) / 100;
		price = price - discountAmount;
		return price;
	}
	
	public void displayDetails()
	{
		System.out.println("Product ID : "+getProductId());
		System.out.println("Product Name : "+getProductName());
		System.out.println("Product Price : "+getPrice());
	}
}