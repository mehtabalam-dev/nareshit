package inheritancePrograms;

import java.util.Scanner;

public class Qsn02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter produtc details...");
		String productName = sc.nextLine();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		double discount = sc.nextDouble();
		
		
 
		
		DiscountProduct dp = new DiscountProduct(productName, price, quantity, discount);
		dp.displayDetails();
		System.out.println("Total Amount: "+dp.calculateTotal());
		System.out.println("Total After Discount: "+dp.calculateTotalAfterDiscount());
	}

}
class Product{
	
	public String productName;
	public double price;
	public int quantity;
	
	public Product(String productName, double price, int quantity) {
		
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	
	public void displayDetails() {
		
		System.out.println("Product Details: ");
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+price);
		System.out.println("Product Quantity: "+quantity);
		
	}
	
	public double calculateTotal() {
		
		double result = this.price * this.quantity;
		return result;
	}
}

class DiscountProduct extends Product{
	
	public double discount;
	
	public DiscountProduct(String productName, double price, int quantity, double discount) {
		
		super(productName,price,quantity);
		this.discount = discount;
		
	}
	
	public void displayDetails() {
		
		System.out.println("Discount Details:");
		super.displayDetails();
		System.out.println("Product Discount: "+discount);
	}
	
	public double calculateTotalAfterDiscount() {
		
		double total = calculateTotal();
		double finalAmount = total - total * discount / 100;
		return finalAmount;
	}
}
