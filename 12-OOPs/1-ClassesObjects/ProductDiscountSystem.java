/*Question 6: Write a Java program to implement a Product Discount System.
Create a class Product with attributes productId, name, and price.Apply discount based on price: - Price > 5000 => 20% Discount - Price 2000 to 5000 => 10% Discount - Price < 2000 => No Discount Display the final price after discount.
Input: Enter Product Id : 101 Enter Product Name : Headphones Enter Price : 6000
Output: Product Id : 101 Product Name : Headphones Original Price : 6000 Discount : 20% Final Price : 4800*/

import java.util.Scanner;
class Product
{
    Scanner sc = new Scanner(System.in);
    private int productId;
    private String name;
    private double price;
	private double discount = 0, discountPrice = 0;
    void setInfo()
    {
        System.out.print("Enter Product ID : ");
        productId = sc.nextInt();
		
		System.out.print("Enter Product Name : ");
        name = sc.next();
		
		System.out.print("Enter Product price : ");
        price = sc.nextDouble();	
    }
    void showResult()
    {
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + name);
        System.out.println("Product Original Price : " + price);
        if(price > 5000)
		{
			discount = 20.0/100.0;
			discountPrice = discount*price;
			price = price-discountPrice;
            System.out.println(discount + "Final Price : "+price);
		}
		else if(price >= 2000 && price <= 5000)
		{
			discount = 10.0/100.0;
			discountPrice = discount*price;
			price = price-discountPrice;
            System.out.println(discount + "Final Price : "+price);
		}
        else
            System.out.println("No Discount Display the final price after discount");
    }
}

public class ProductDiscountSystem
{
    public static void main(String args[])
    {
		Product t1 = new Product();
        t1.setInfo();
        t1.showResult();
    }
}