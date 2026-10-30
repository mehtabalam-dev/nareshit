package collectionsPrograms;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableQsn03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Library chemistry = new Library();
		System.out.println("Enter number of books : ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter book ID, name, quantity of book : " + (i+1));
			int id = Integer.parseInt(sc.nextLine());
			String name = sc.nextLine();
			int quantity = Integer.parseInt(sc.nextLine());
			chemistry.addBook(new Book01(id, name, quantity));
		}
		System.out.println("Enter book ID and new quantity : ");
		int newBookId = Integer.parseInt(sc.nextLine());
		int newQuantity = Integer.parseInt(sc.nextLine());
		chemistry.updateBook(newBookId, newQuantity);
		
		System.out.println("Enter book Id to search : ");
		int sid = sc.nextInt();
		chemistry.displayBook(sid);
	}
}
class Library
{
	public Hashtable<Integer, Book01> table = new Hashtable<Integer, Book01>();
	public void addBook(Book01 b)
	{
		table.put(b.getBookId(), b);
	}
	public void updateBook(int id, int quantity)
	{
		if(table.containsKey(id))
		{
			table.get(id).setQuantity(quantity);
		}
		else
		{
			System.out.println("Book not found");
		}
	}
	public void displayBook(int id)
	{
		if(table.containsKey(id))
		{
			System.out.println(table.get(id));
		}
		else
		{
			System.out.println("Book not found");
		}
	}
}
class Book01
{
	private int bookId;
	private String bookName;
	private int quantity;
	public Book01(int bookId, String bookName, int quantity) 
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.quantity = quantity;
	}
	public int getBookId() 
	{
		return bookId;
	}
	public void setBookId(int bookId) 
	{
		this.bookId = bookId;
	}
	public String getBookName() 
	{
		return bookName;
	}
	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	@Override
	public String toString() 
	{
		return "Book [bookId=" + bookId + ", bookName=" + bookName + 
				", quantity=" + quantity + "]";
	}
}