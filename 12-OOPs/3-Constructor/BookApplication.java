/*Question 3: Write a Java program to demonstrate constructor overloading using a Book class.
Description: Create Book class with bookId, bookName and price. Create one default constructor and one parameterized constructor. Display values initialized by both constructors.
INPUT: (Default constructor gives default values) Enter Book Id: 11 Enter Book Name: Java Basics Enter Price: 450
OUTPUT: Book from Default Constructor: Book Id: 0 Book Name: Unknown Price: 0
      Book from Parameterized Constructor: Book Id: 11 Book Name: Java Basics Price: 450*/

class Book
{
	private int bookId;
	private String bookName;
	private int price;
	
	Book(){}
	
	Book(int bookId, String bookName, int price)
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	public void setBookId(int bookId)
	{
		this.bookId = bookId;
	}
	public int getBookId()
	{
		return bookId;
	}
	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}
	public String getBookName()
	{
		return bookName;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
}
public class BookApplication
{
	public static void main(String x[])
	{
		Book b1 = new Book();
		Book b = new Book(11, "Java Basics", 450);
		System.out.println("Book info with Default Constructor : ");
        System.out.println("Book ID  : " + b1.getBookId() + " Book Name : " + (b1.getBookName()) + "  Price : " + (b1.getPrice()));
		System.out.println("Book info with Parameterized Constructor : ");
		System.out.println("Book ID  : " + b.getBookId() + " Book Name : " + (b.getBookName()) + "   Price : " + (b.getPrice()));
	}
}