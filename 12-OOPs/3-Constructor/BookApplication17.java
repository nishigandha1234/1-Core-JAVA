/*Question 17: Write a Java program to sort Book objects based on price.
Description: Create Book class with id, name and price. Store 5 books using constructor. Sort based on price using simple sorting logic.
INPUT: 1 Java 500 2 Python 450 3 C++ 600 4 SQL 300 5 HTML 250
OUTPUT: Books sorted by price: HTML 250 SQL 300 Python 450 Java 500 C++ 600*/ 

import java.util.Scanner;
class Book
{
	private int id;
	private String name;
	private int price;

	Book(int id, String name, int price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
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
public class BookApplication17
{
	public static void main(String x[])
	{
		Book b[] = new Book[5];
		
		b[0] = new Book(1, "Java", 500);
		b[1] = new Book(2, "Python", 450);
		b[2] = new Book(3, "C++", 600);
		b[3] = new Book(4, "SQL", 300);
		b[4] = new Book(5, "HTML", 250);
		
		for(int i = 0 ; i < b.length ; i++)
		{
			for(int j = i+1 ; j < b.length ; j++)
			{
				if(b[i].getPrice() > b[j].getPrice())
				{
					Book temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.println("Books sorted by price:");

		for(int i = 0 ; i < b.length ; i++)
		{
			System.out.println("Name :" + b[i].getName() + " "+ "Price : " +b[i].getPrice());
		}
	}
}
