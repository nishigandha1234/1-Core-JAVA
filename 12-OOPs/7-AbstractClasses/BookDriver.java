/*Question 47: Create an abstract class Book to manage book issue details.
Abstract class Book contains title and abstract method getDetails().Subclasses:EBook ? display file size PrintedBook ? display number of pages
Input Type: EBook Title: Java Basics File Size: 5MB
Output Book: Java Basics File Size: 5MB*/

import java.util.Scanner;
abstract class Book
{
	String title;
	Book(String title)
	{
		this.title = title;
	}
	abstract void getDetails();
} 
class EBook extends Book
{
	String fileSize;
	
	EBook(String title, String fileSize)
	{
		super(title);
		this.fileSize = fileSize;
	}
	public void getDetails()
	{
		System.out.println("Book Name : "+title);
		System.out.println("Book FileSize : "+fileSize);
	}
}
class PrintedBook extends Book
{
	int noOfPages;
	
	PrintedBook(String title, int noOfPages)
	{
		super(title);
		this.noOfPages = noOfPages;
	}
	public void getDetails()
	{
		System.out.println("Book Name : "+title);
		System.out.println("No. of Pages : "+noOfPages);
	}
}
public class BookDriver
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Book Type (EBook/PrintedBook) : ");
		String type = sc.next();
		
		sc.nextLine();        // Consume the newline left by next()

		System.out.println("Enter Title : ");
		String title = sc.nextLine();
		
		Book b;
		
		if(type.equalsIgnoreCase("EBook"))
		{
			System.out.println("Enter the File Size of Book : ");
			String fileSize = sc.next();
			
			b = new EBook(title, fileSize);
		}
		else 
		{
			System.out.println("Enter the Number of Pages : ");
			int noOfPages = sc.nextInt();
			
			b = new PrintedBook(title, noOfPages);
		}
		b.getDetails();
	}
}