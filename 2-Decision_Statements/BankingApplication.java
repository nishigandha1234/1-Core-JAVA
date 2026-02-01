import java.util.*;

public class BankingApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Banking Menu From Below: ");
        double balance = 0.0, amount;
		int choice;
		
    do
	{
		System.out.println("\n--- Banking Menu ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1 : 
			{
				System.out.println("Enter the Amount want to Deposit");
				amount = sc.nextDouble();
				balance += amount;
				System.out.println("Amount Deposited Successfully...");
				break;
			}
			case 2 : 
			{
				System.out.println("Enter the Amount want to Withdraw");
				amount = sc.nextDouble();
				if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Amount withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
				break;			
			}
			case 3 :  
			{
				System.out.println("Current Balance : " + balance);
				break;
			}
			case 4 :  
			{
				System.out.println("Thank you for using the banking system.");
				break;
			}
			default :
				System.out.println("Invalid Choice. Please try again");
		}
	}while(choice != 4);
	}
}