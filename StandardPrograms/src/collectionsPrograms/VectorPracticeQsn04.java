package collectionsPrograms;

import java.util.Vector;

public class VectorPracticeQsn04 
{
	public static void main(String[] args)
	{
		Vector<Book> v = new Vector<Book>();
		Book obj = new Book(101, "mnv", "bhg");
		Book obj2 = new Book(102, "nhy", "jhy");
		v.add(obj);
		v.add(obj2);
		
		for(Book e : v)
		{
			e.displayDetails();
			System.out.println();
		}
		Book b = v.get(0);
		if(b.borrowBook())
		{
			System.out.println("Book borrowed successfully");
		}
		else
		{
			System.out.println("Book not avaialble");
		}
		b.displayDetails();
		for(Book e : v)
		{
			e.displayDetails();
			System.out.println();
		}
		
	}
}
class Book
{
	public int bookId;
	public String title;
	public String author;
	public boolean available = true;
	
	public Book(int bookId,String title,String author)
	{
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	public boolean borrowBook()
	{
		if(available)
		{
			available = false;
			return true;
		}
		return false;
	}
	
	public void displayDetails()
	{
		System.out.println("Book Id     : "+bookId);
		System.out.println("Book title  :  "+title);
		System.out.println("Book Availability  : "+available);
	}
}