/*Question 44: Create an abstract class BankAccount to perform banking operations. Create abstract class BankAccount with: Abstract methods deposit() and withdraw() Variable balance Create subclasses: SavingsAccount ? minimum balance required CurrentAccount ? no minimum balance Program should perform deposit and withdrawal operations and display final balance. 
Input Account Type: Savings Initial Balance: 1000 Deposit: 500 Withdraw: 300
Output Final Balance: 1200*/

import java.util.Scanner;
abstract class BankAccount
{
	double balance;
	
	BankAccount(double balance)
	{
		this.balance = balance;
	}
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	void display()
	{
		System.out.println("Final Balance : "+balance);
	}
} 
class SavingsAccount extends BankAccount
{
	final double minBalance = 500;
		
	SavingsAccount(double balance)
	{
		super(balance);
	}
	public void deposit(double amount)
	{
		balance += amount; 
	}
	public void withdraw(double amount)
	{
		if(balance-amount >= minBalance)
			balance -= amount; 
		else 
            System.out.println("Withdrawal not allowed! Minimum balance should be " + minBalance);
	}
}
class CurrentAccount extends BankAccount
{
	CurrentAccount(double balance)
	{
		super(balance);
	}
	public void deposit(double amount)
	{
		balance += amount; 
	}
	public void withdraw(double amount)
	{
		if(amount <= balance)
			balance -= amount; 
		else 
            System.out.println("Insufficient Balance...");
	}
}
public class BankDriver
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Type (Savings/Current) : ");
		String type = sc.next();
		
		System.out.println("Enter Initial Balance : ");
		double balance = sc.nextDouble();
		
		BankAccount b1; 
		if(type.equalsIgnoreCase("Savings"))
		{
			b1 = new SavingsAccount(balance);
		}
		else 
		{
			b1 = new CurrentAccount(balance);
		}
		
		System.out.println("Enter Deposit Amount : ");
		double amount1 = sc.nextDouble();
		b1.deposit(amount1);
		
		System.out.println("Enter Withdraw Amount : ");
		double amount2 = sc.nextDouble();
		b1.withdraw(amount2);
		
		b1.display();
	}
}