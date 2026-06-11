/*Question 24: Write a Java program to calculate total price of 5 items.
Description: Create Item class with itemName and price. Store using constructor. Calculate total bill. INPUT: Pen 10 Book 50 Bag 500 Bottle 200 Scale 20
OUTPUT: Total Bill Amount: 780*/

import java.util.*;
class Item
{
	private String itemName;
	private int price;

	Item(String itemName, int price)
	{
		this.itemName = itemName;
		this.price = price;
	}
	public void setitemName(String itemName)
	{
		this.itemName = itemName;
	}
	public String getitemName()
	{
		return itemName;
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
public class ItemApplication23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Item a1 = new Item("Pen", 10);
		Item a2 = new Item("Book", 50);
		Item a3 = new Item("Bag", 500);
		Item a4 = new Item("Bottle", 200);
		Item a5 = new Item("Scale", 20);
		
		System.out.println("Total Bill Amount : " + (a1.getPrice()+a2.getPrice()+a3.getPrice()+a4.getPrice()+a5.getPrice()));
	}
}
