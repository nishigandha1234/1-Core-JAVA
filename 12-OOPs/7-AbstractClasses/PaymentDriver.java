/*Question 46: Create an abstract class Payment to process different payment methods. Create abstract class Payment with: Abstract method payAmount() Create subclasses: CreditCardPayment UPIPayment Each subclass should display payment mode and amount paid. 
Input Payment Method: UPI Amount: 2000
Output Payment done using UPI Amount Paid: 2000*/

import java.util.Scanner;
abstract class Payment
{
	abstract void payAmount();
} 
class CreditCardPayment extends Payment
{
	double amount;
	
	CreditCardPayment(double amount)
	{
		this.amount = amount;
	}
	public void payAmount()
	{
		System.out.println("Payment done using Credit Card");
		System.out.println("Amount paid : "+ amount);
	}
}
class UPIPayment extends Payment
{
	double amount;
	
	UPIPayment(double amount)
	{
		this.amount = amount;
	}
	public void payAmount()
	{
		System.out.println("Payment done using UPI");
		System.out.println("Amount paid : "+ amount);
	}
}
public class PaymentDriver
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Payment Type (CreditCard/UPI) : ");
		String type = sc.next();
		
		System.out.println("Enter Amount : ");
		double amount = sc.nextDouble();
	
		Payment p;
		
		if(type.equalsIgnoreCase("CreditCard"))
		{
			p = new CreditCardPayment(amount);
		}
		else 
		{
			p = new UPIPayment(amount);
		}
		p.payAmount();
	}
}