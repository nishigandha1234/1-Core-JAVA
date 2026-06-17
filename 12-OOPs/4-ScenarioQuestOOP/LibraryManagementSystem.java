/*Scenario 1: Library Management System*/
import java.util.Scanner;
class Book
{
	int bookId;
	String title;
	String author;
	int price;
	String status;
	
	private static String libraryName = "Study Point Library";
	private static int totalBooks = 0 ;

	Book(int bookId, String title, String author,int price)
	{
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		this.status = "Available";
		
		totalBooks++;
	}
	public void issueBook()
	{
		if(status.equals("Available"))
		{
			status = "issued";
			System.out.println(title+" : Book Issued...");
		}
		else
		{
			System.out.println(title+" : Already Issued...");
		}
	}
	public static int getTotalBooks()
	{
		return totalBooks;
	}
	public int getBookId()
	{
		return bookId;
	}
	public static void setLibraryName(String libraryName)
	{
		Book.libraryName = libraryName;
	}
	public boolean searchId(int bookId)
	{
		return this.bookId == bookId;
	}
	public void display()
	{
		System.out.println("\nBooks Details...");
		System.out.println("Books id : "+bookId);
		System.out.println("Books Title : "+title);
		System.out.println("Books Author : "+author);
		System.out.println("Books Price : "+price);
		System.out.println("Books Status : "+status);
	}
}
public class LibraryManagementSystem
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Book[] b = new Book[1000];
		b[0] = new Book(101,"Java","James Gosling", 500);
		b[1] = new Book(102,"Python","Guido", 450);
		b[2] = new Book(103,"DBMS","Korth", 600);

		do{
			System.out.println("\n1. Get Total Number of Books : ");
			System.out.println("2. Issue Books : ");
			System.out.println("3. Change Library Name : ");
			System.out.println("4. Display All the Books : ");
			System.out.println("5. Exit : ");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 :
				{
					System.out.println("Total Books : "+Book.getTotalBooks());
					break;
				}
				case 2 :
				{
					b[0].issueBook();
					break;
				}
				case 3 :
				{
					System.out.println("Do you want to change Library Name : ");
					String flag = sc.next();
					if(flag.equals("yes"))
					{
						System.out.println("Enter name want to change : ");
						String name = sc.next();
						Book.setLibraryName(name);
						System.out.println("Library Name Changed");
					}
					else{
						System.exit(0);
					}
					break;
				}
				case 4 :
				{
					for(int i = 0 ;i < b.length ; i++)
					{
						if(b[i] != null)
						{
							b[i].display();
						}
					}
					break;
				}
				case 5 :
				{
					System.exit(0);
				}
				default :
				{
					System.out.println("Entered Invalid Choice");
				}
				
			}
		}while(true);
	}


}