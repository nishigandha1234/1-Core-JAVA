/*Question 4: Write a Java program to create a Product class and check whether product price is expensive or affordable.
Description: Create Product POJO class with productId, productName and price. Use constructor to initialize values. If price > 1000 print Expensive otherwise Affordable.
INPUT: Enter Product Id: 501 Enter Product Name: Headphones Enter Price: 1200 
OUTPUT: Product Name: Headphones Category: Expensive Product*/

class Product
{
	private int productId;
	private String productName;
	private int price;

	Product(int productId, String productName, int price)
	{
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	public int getProductId()
	{
		return productId;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public String getProductName()
	{
		return productName;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	public String getCost()
	{
		if(price > 1000)
			return "Expensive";
		else
			return "Affordable";
	}
}
public class ProductApplication
{
	public static void main(String x[])
	{
		Product p = new Product(501, "Headphones", 1200);
        System.out.println(" Product Name : " + p.getProductName() + " Category : " + (p.getCost()));
	}
}