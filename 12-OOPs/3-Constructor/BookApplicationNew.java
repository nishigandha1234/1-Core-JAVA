/*Problem 3: Book Management
Create a Book class with: bookId title author price
Chain constructors so that:
Default constructor assigns predefined values.
Other constructors progressively initialize more fields.*/

import java.util.*;
class Book
{
	private int bookId ;
	private String title;
	private String author;
	private int price;

	Book(int bookId,String title,String author,int price)
	{
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;1
	}
	public void setId(int empId)
	{
		this.empId = empId;
	}
	public int getempId()
	{
		return empId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setdepartment(String department)
	{
		this.department = department;
	}
	public String getdepartment()
	{
		return department;
	}
}
public class BookApplicationNew
{
	public static void main(String x[])
	{
		Book b = new Book();
	}
}
