package arrayPrograms;

import java.util.Scanner;

public class ArrayReferenceObject 
{
	static Book barr[];
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of books : ");
		int size = sc.nextInt();
		barr = new Book[size];
		for(int i = 0; i <= barr.length-1; i++)
		{
			System.out.println("Enter author name, title, price and published year of book : "+(i+1));
			String authorName = IO.readln();
			String title = IO.readln();
			double price = Double.parseDouble(IO.readln());
			int publishedYear = Integer.parseInt(IO.readln());
			barr[i] = new Book(authorName,title,price,publishedYear); 	
		}
		System.out.println("Available books are :");
}
//		for(Book e : barr)
//		{
//			e.displayDetails();
//			System.out.println("===============================================================================================");
//		}
	public static void BooksByAuthor(String authorName)
	{
		for(Book e : barr)
		{
			if(authorName.equalsIgnoreCase(e.authorName))
			{
				e.displayDetails();
				System.out.println("========================================================================================");
			}
		}
	}
		public static void booksPublishedAfterCertainYear(int year)
		{
			for(Book e : barr)
			{
				if( e.publishedYear>year)
				{
					e.displayDetails();
					System.out.println("========================================================================================");
				}
			}
		}
	}

class Book
{
	public String authorName;
	public String title;
	public double price;
	public int publishedYear;
	public Book(String authorName, String title, double price, int publishedYear) 
	{
		this.authorName = authorName;
		this.title = title;
		this.price = price;
		this.publishedYear = publishedYear;
	}
	public void displayDetails()
	{
		System.out.println("Title           : "+title);
		System.out.println("Author Name     : "+authorName);
		System.out.println("Price           : "+price);
		System.out.println("Published Year  : "+publishedYear);
	}
}





