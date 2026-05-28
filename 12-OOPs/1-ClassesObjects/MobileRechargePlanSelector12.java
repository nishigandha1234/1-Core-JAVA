/*Question 12: Write a Java program to implement a Mobile Recharge Plan Selector.
Create a class Recharge with attributes mobileNumber and planAmount.
Determine plan benefits:- Plan 199 => 1GB/day - Plan 399 => 2GB/day - Plan 599 => 3GB/day - Other => Invalid Plan
Input: Enter Mobile Number : 9876543210 Enter Plan Amount : 399 
Output:Mobile Number : 9876543210 Plan : 399 Benefit : 2GB per day*/

import java.util.Scanner;
class Recharge
{
	long mobileNumber;
	int planAmount;
	
	void setValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Mobile Number : ");
		mobileNumber = sc.nextLong();
		System.out.println("Enter your Plan Amount : ");
		planAmount = sc.nextInt();
	}
	void calculateRecharge()
	{
		System.out.println("Mobile Number : " + mobileNumber);
		System.out.println("Plan : " + planAmount);
		
		if(planAmount == 199)
			System.out.println("Benefit : 1GB per Day");
		
		else if(planAmount == 399)
			System.out.println("Benefit : 2GB per Day");
		
		else if(planAmount == 599)
			System.out.println("Benefit : 3GB per Day");
		
		else
			System.out.println("INVALID PLAN...!!!");
	}
}
public class MobileRechargePlanSelector12
{
	public static void main(String x[])
	{
		Recharge s1 = new Recharge();
		s1.setValue();
		s1.calculateRecharge();
	}
}