/*Question 15: Write a Java program to create a Product inventory and update product price.
Description: Create Product class with id, name and price. Store products using constructor. Accept product id and new price and update it.
INPUT: Products: 1 Mouse 500 2 Keyboard 800 3 Monitor 9000 
Enter Product Id to update: 2
Enter new price: 1000
OUTPUT: Updated Product: Keyboard Price: 1000*/

import java.util.Scanner;
class ProductInventory
{
	private int id;
	private String name;
	private int price;

	ProductInventory(int id, String name, int price)
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
public class ProductInventoryApplication 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ProductInventory p1 = new ProductInventory(1, "Mouse", 500 );
		ProductInventory p2 = new ProductInventory(2, " Keyboard", 800 );
		ProductInventory p3 = new ProductInventory(3, " Monitor",  9000);
		System.out.println("Enter Product Id to update : " );
		int choice = sc.nextInt();
		System.out.println("Enter new price : " );
		int newPrice = sc.nextInt();
		if(choice == 1)
			System.out.println("Updated Product : "+p1.getName()+" \nNew Price: "+newPrice);
		else if(choice == 2)
			System.out.println("Updated Product : "+p2.getName()+" \nNew Price: "+newPrice);
		else if(choice == 3)
			System.out.println("Updated Product : "+p3.getName()+" \nNew Price: "+newPrice);
		else 
			System.out.println("ENTERED INVALID CHOICE");
	}
}
