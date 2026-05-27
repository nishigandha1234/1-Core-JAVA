/*Question 8: Write a Java program to implement a Bank Balance Checker.
Create a class BankAccount with attributes accountNumber, name, and balance.
Check account status:- balance >= 10000 => Premium Account - balance 5000 to 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Input:Enter Account Number : 98765 Enter Name : Neha Enter Balance : 4500
Output:Account Number : 98765 Name : Neha Balance : 4500 Status : Low Balance Warning*/


import java.util.Scanner;
class BankAccount
{
	Scanner sc = new Scanner(System.in);
	private int accountNumber;
	private String name;
	private double balance;
	
	void setInfo()
    {
        System.out.print("E
        System.out.print("Enter accountNumber : ");
        accountNumber = sc.nextInt();
		
		System.out.print("Enter Name : ");
        name = sc.next();
		
		System.out.print("Enter Balance : ");
        balance = sc.nextDouble();	
    }
	
	void showResult()
	{
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Name : "+name);
		System.out.println("Balance : "+ balance);
		System.out.print("Status : ");
		if(balance >= 10000 )
			System.out.println("Premium Account");
		
		else if(balance >= 5000 && balance <= 9999)
			System.out.println(" Normal Account");
		
		else 
			System.out.println("Low Balance Warning...!!!");
	} 
}

public class BankBalanceChecker
{
	public static void main(String x[])
	{
		BankAccount b1 = new BankAccount();
		b1.setInfo();
		b1.showResult();
	}
}