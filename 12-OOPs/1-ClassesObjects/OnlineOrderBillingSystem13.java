/*Question 14: Write a Java program to implement an Online Order Billing System.
Create a class Order with attributes orderId, productPrice, and quantity.
Calculate:- Total amount = productPrice * quantity - If total > 5000 => 15% discount - Otherwise => No discount. Display final amount after discount.
Input:Enter Order Id : 1001 Enter Product Price : 1200 Enter Quantity : 5
Output: Order Id : 1001 Total Amount : 6000 Discount : 900 Final Amount : 5100*/

import java.util.Scanner;
class Order
{
	int orderId;
	int productPrice;
	int quantity;
	
	void setValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Order Id : ");
		orderId = sc.nextInt();
		System.out.println("Enter Product price : ");
		productPrice = sc.nextInt();
		System.out.println("Enter Quantity : ");
		quantity = sc.nextInt();
	}
	void calculateDiscount()
	{
		System.out.println("Order Id : " + orderId);
		int total = productPrice*quantity;
		System.out.println("Total Amount : " + total);
		int discount = 0;
		if(total > 5000)
		{
			discount = (total*15) / 100;
			System.out.println("Discount : "+discount);
			System.out.println("Final Amount : "+(total-discount));
		}
		else
			System.out.println("NO DISCOUNT...!!!");
	}
}
public class OnlineOrderBillingSystem13
{
	public static void main(String x[])
	{
		Order s1 = new Order();
		s1.setValue();
		s1.calculateDiscount();
	}
}