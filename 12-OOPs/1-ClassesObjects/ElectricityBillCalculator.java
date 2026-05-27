/*Question 7: Write a Java program to implement an Electricity Bill Calculator.
Create a class ElectricityBill with attributes customerId, name, and units.
Calculate bill using slabs: First 100 units => Rs.5 per unit - Next 100 units => Rs.7 per unit - Above 200 units => Rs.10 per unit Display total bill.
Input: Enter Customer Id : 301 Enter Name : Suresh Enter Units : 250
Output: Customer Id : 301 Name : Suresh Units : 250 Total Bill : Rs. 1850*/

import java.util.Scanner;
class ElectricityBill
{
    Scanner sc = new Scanner(System.in);
    private int customerId;
    private String name;
    private int units;
	
    void setInfo()
    {
        System.out.print("Enter Customer ID : ");
        customerId = sc.nextInt();
		
		System.out.print("Enter Customer Name : ");
        name = sc.next();
		
		System.out.print("Enter units : ");
        units = sc.nextInt();	
    }
    void showResult()
    {
		double totalBills = 0 ;
		
        if(units <= 100)
		{
			totalBills = units * 5;
		}
		else if(units <= 200)
		{
			totalBills = (100 * 5) + ((units - 100) * 7);
		}
        else
            totalBills = (100 * 5) + (100 * 7) + ((units - 200) * 13);
	
        System.out.println("Customer ID : " + customerId);
        System.out.println("Customer Name : " + name);
        System.out.println("Units : " + units);
        System.out.println("Total Bills : Rs. " + (int)totalBills);
    }
}

public class ElectricityBillCalculator
{
    public static void main(String args[])
    {
		ElectricityBill t1 = new ElectricityBill();
        t1.setInfo();
        t1.showResult();
    }
}