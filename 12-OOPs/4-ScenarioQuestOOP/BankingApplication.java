/*2.	Banking Application
In an online banking system, customers can transfer money using an account number, mobile number, or UPI ID. How would you design a transferMoney() method using function overloading to handle these different ways of transferring money?
Scenario: A banking application allows money transfers through different methods.
Case 1: The customer transfers money using the beneficiary account number.
Case 2: The customer transfers money using a registered mobile number.
Case 3: The customer transfers money using a **UPI ID**.
*/

class Banking
{
	public void transferMoney(long accountNumber, double amount)
	{
		System.out.println("Money Transferred using Account Number");
		System.out.println("Account Number : "+ accountNumber);
		System.out.println("Amount : " + amount);
	}
	public void transferMoney(long mobileNumber, double amount, String type)
	{
		System.out.println("Money Transferred using Mobile Number");
		System.out.println("Mobile Number : "+ mobileNumber);
		System.out.println("Amount : " + amount);
	}
	public void transferMoney(String upiId, double amount)
	{
		System.out.println("Money Transferred using UPI ID");
		System.out.println("UPI ID : "+ upiId);
		System.out.println("Amount : " + amount);
	}
}
public class BankingApplication
{
	public static void main(String x[])
	{
		Banking b = new Banking();
		b.transferMoney(123123123123L, 5000);
		b.transferMoney(8727262617L, 9000);
		b.transferMoney("Rahul@upi", 200);
	
	}
}