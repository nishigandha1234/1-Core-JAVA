/*Question 13: Write a Java program to demonstrate constructor overloading in a Mobile class and apply discount calculation.
Description: Create Mobile class with mobileId, mobileName and price. Create overloaded constructors (one without discount, one with discount). If discount constructor used, reduce 10% price.
INPUT: Enter Mobile Id: 101 Enter Mobile Name: Samsung Enter Price: 20000 
OUTPUT: Original Price: 20000 Discount Price: 18000*/
 
class Mobile
{
	private int mobileId;
	private String mobileName;
	private int price;

	Mobile(int mobileId, String mobileName, int price, int discount)
	{
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.price = pr
		this.price = price - (price* 10/100);
	}
	Mobile(int mobileId, String mobileName, int price)
	{
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.price = price;
	}
	public void setMobileId(int mobileId)
	{
		this.mobileId = mobileId;
	}
	public int getMobileId()
	{
		return mobileId;
	}
	public void setMobileName(String mobileName)
	{
		this.mobileName = mobileName;
	}
	public String getMobileName()
	{
		return mobileName;
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
public class MobileApplication 
{
	public static void main(String x[])
	{
		Mobile original = new Mobile(101, "Samsung" , 20000);
		Mobile discount = new Mobile(101, "Samsung" , 20000, 1);
		System.out.println("Original Price: " + original.getPrice());
		System.out.println("Discount Price: " + discount.getPrice());
	}
}
