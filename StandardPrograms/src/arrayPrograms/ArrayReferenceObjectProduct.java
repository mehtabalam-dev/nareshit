package arrayPrograms;

import java.util.Scanner;

public class ArrayReferenceObjectProduct
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of product : ");
		int size = sc.nextInt();
		Product[] arr = new Product[size];
		sc.nextLine();
		for(int i = 0; i <= arr.length-1;i++)
		{
			System.out.println("Enter productId,productName,category,price of product : "+(i+1));
			int productId = sc.nextInt();
			sc.nextLine();
			String productName = sc.nextLine();
			String category = sc.nextLine();
			double price = sc.nextDouble();
			arr[i] = new Product(productId, productName, category, price);
			sc.nextLine();
		}
	}
	
}
class Product
{
	public int productId;
	public String productName;
	public String category;
	public double price;
	public Product(int productId, String productName, String category, double price) 
	{
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	public void displayDetails()
	{
		System.out.println("Product ID    : "+productId);
		System.out.println("Product name  : "+productName);
		System.out.println("Category      : "+category);
		System.out.println("Price         : "+price);
	}
	
}
