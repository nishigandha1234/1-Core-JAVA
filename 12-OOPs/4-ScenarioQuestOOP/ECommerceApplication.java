/*3.E-Commerce Application
In an e-commerce website, the placeOrder() functionality should support ordering a single product, multiple products, and products with a discount coupon. How would you use method overloading for the placeOrder () method?
Scenario: Customers can place orders in different ways.
Case 1: The customer purchases a single product.
Case 2: The customer purchases multiple products at once.
Case 3: The customer purchases products and also applies a discount coupon
All these actions perform the same task of placing an order, but they require different input data.  
*/

class ECommerce
{
	public void placeOrder(String product, int quantity)
	{
		System.out.println("Order Placed for Single Product");
		System.out.println("Product Name : "+ product);
		System.out.println("Quantity : " + quantity);
	}
	public void placeOrder(String[] products, int[] quantities)
	{
		System.out.println("\nOrder Placed for Multiple Products");
		for(int i = 0 ; i < products.length ; i++)
		{
			System.out.println("Product : "+ products[i] + ", Quantity : " + quantities[i]);
		}
	}
	public void placeOrder(String[] products, int[] quantities, String couponCode)
	{
		System.out.println("\nOrder Placed with Discount coupon Code");
		for(int i = 0 ; i < products.length ; i++)
		{
			System.out.println("Product : "+ products[i] + ", Quantity : " + quantities[i]);
		}
		System.out.println("Coupon Applied :"+couponCode );
	}
}
public class ECommerceApplication
{
	public static void main(String x[])
	{
		ECommerce e = new ECommerce();
		//case 1
		e.placeOrder("Laptop", 2);
		
		//case 2
		String[] products1 = {"Laptop","I-Phone","Refridgerator"};
		int[] quantities1 = {2,3,1};
		e.placeOrder(products1, quantities1);
		
		
		//case 3
		String[] products2 = {"Bottle","Charger"};
		int[] quantities2 = {2,1};
		String couponCode = "ABC@201";
		e.placeOrder(products2, quantities2, couponCode);
		 
	}
}