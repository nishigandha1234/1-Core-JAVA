/*Question 14: Write a Java program to create a Customer class and search a customer by id.
Description: Create Customer POJO class with id, name and city. Store multiple customers using constructor. Accept id from user and search customer.
INPUT: Enter Customers: 1 Raj Pune 2 Amit Mumbai 3 Neha Nashik
Enter search Id: 2 OUTPUT: Customer Found Name: Amit City: Mumbai*/
import java.util.Scanner;
class Customer
{
	private int id;
	private String name;
	private String city;

	Customer(int id, String name, String city)
	{
		this.id = id;
		this.name = name;
		this.city = city;
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
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getCity()
	{
		return city;
	}
}
public class CustomerApplication 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Customer c1= new Customer(1, "Raj", "Pune");
		Customer c2= new Customer(2, "Amit", "Mumbai");
		Customer c3= new Customer(3, "Neha", "Nashik");
		int choice = sc.nextInt();
		System.out.println("Enter Search Id : " + choice);
		if(choice == 1)
			System.out.println("Name : "+c1.getName()+" \nCity : "+c1.getCity());
		else if(choice == 2)
			System.out.println("Name : "+c2.getName()+" \nCity : "+c2.getCity());
		else if(choice == 3)
			System.out.println("Name : "+c3.getName()+" \nCity : "+c3.getCity());
		else 
			System.out.println("ENTER INVALID CHOICE");
	}
}
