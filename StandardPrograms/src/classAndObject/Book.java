package classAndObject;

import java.util.Scanner;

public class Book {
	public String bookName;
	public String authorName;
	public double price;
	
	public Book(String bookName, String authorName, double price){
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price; 
		
	}
	
	public void displayBookInfo() {
		System.out.println("Bookname : "+bookName);
		System.out.println("Authorname : "+authorName);
		System.out.println("Price : "+price);
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully : "+bookName);
	}
	
	public static void main(String[] args) {
//		Book b1 = new Book("Physics", "HC Verma", 1000);
//		b1.displayBookInfo();
//		b1.issueBook();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book name,Author name and price one by one...");
		String bookName = sc.nextLine();
		String authorName = sc.nextLine();
		double price = sc.nextDouble();
		
		Book b1 = new Book(bookName, authorName, price);
		b1.displayBookInfo();
		b1.issueBook();
		
		
	}

}
