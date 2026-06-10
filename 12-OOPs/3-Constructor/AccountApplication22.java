/*Question 22: Write a Java program to create Account objects and deposit amount.
Description: Create Account class with accountNumber, name and balance. Accept deposit amount and update balance.
INPUT: Account: 101 Raj 5000 Deposit Amount: 2000
OUTPUT: Updated Balance: 7000*/
import java.util.*;
class Account
{
	private String name;
	private long accountNumber;
	private int balance;
	
	Account(long accountNumber, S
	Account(long accountNumber, String name, int balance)
	{
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public void setaccountNumber(long accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public long getAccountNumber()
	{
		return accountNumber;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public int getBalance()
	{
		return balance;
	}
}
public class AccountApplication22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account(101, "Raj", 5000);
		System.out.println("Deposit Amount : ");
		int amount = sc.nextInt();
		
		System.out.println(" Updated Balance : " + (amount+a1.getBalance())cmdcmd);
	}
}
