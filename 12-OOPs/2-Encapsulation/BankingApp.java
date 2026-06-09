/* Suppose consider we are working on banking application we have class name as BankAccount and we want to give deposit and withDraw functionality in BankAccount class 
But we want to deposit or withdraw functionality must be allowed after login 
*/

import java.util.*;
class Bank
{
	private int balance;
	private String username = "";
	private String password = "";
	
	public int getBalance()
	{
		return balance;
	}
	public boolean isUser(String username, String password)
	{
		this.username = username;
		this.password = password;
		if(username.equals("ram") && password.equals("ram"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void setDeposit(int amount)
	{
		if(this.username.length() > 0 && this.password.length() > 0)
		{
			balance += amount;
		}
		else{
			System.out.println("Please Login in the System first...");
		}
	}
	public void setWithdraw(int amount)
	{
		if(this.username.length() > 0 && this.password.length() > 0)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Please Login First...");
		}
	}
}
public class BankingApp
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		Bank account = new Bank();
		do
		{
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("Enter your Choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1 :
				{
					System.out.println("Enter your Username & Password");
					String u = sc.nextLine();
					String p = sc.nextLine();
					
					boolean flag = account.isUser(u,p);
					if(flag)
					{
						System.out.println("Enter your amount to Deposit...");
						int amnt = sc.nextInt();
						account.setDeposit(amnt);
						System.out.println("After deposit your balance is "+account.getBalance());
					}
					else
					{
						System.out.println("Invalid user");
					}
					break;
				}
				case 2 :
				{
					System.out.println("Enter your Username & Password");
					String u = sc.nextLine();
					String p = sc.nextLine();
					boolean flag = account.isUser(u,p);
					if(flag)
					{
						System.out.println("Enter your amount to Withdraw...");
						int widAmnt = sc.nextInt();
						account.setWithdraw(widAmnt);
						System.out.println("After Withdraw your balance is "+account.getBalance());
					}
					else
					{
						System.out.println("Invalid user");
					}
					break;
				}
				case 3 :
				{
					System.exit(0);
					break;
				}
				default :
				{
					 System.out.println("Wrong choice");
				}
			}
			
		}while(true);
	}
}