/*Question 15: Write a Java program to implement a Parking Fee Calculator. Create a class Parking with attributes vehicleNumber and hours. 
Calculate parking fee:- First 2 hours => Rs.20 per hour - Remaining hours => Rs.30 per hour. Display total fee.
Input: Enter Vehicle Number : MH12AB1234 Enter Hours : 5
Output: Vehicle Number : MH12AB1234 Parking Hours : 5 Total Parking Fee : Rs. 130*/

import java.util.Scanner;

class Parking
{
	String vehicleNumber;
	int hours;
	
	void setValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your vehicle Number : ");
		vehicleNumber = sc.next();
		System.out.println("Enter Hours : ");
		hours = sc.nextInt();
	}
	void calculateFee()
	{
		System.out.println("Vehicle Number : " + vehicleNumber);
		System.out.println("Parking Hours : " + hours);
		int firstTwo = 0;
		int ans = 0;
		if(hours <= 2)
			System.out.println("Total fee is 40Rs");
		else if(hours > 2)
		{
			firstTwo = 2*20;
			int remaining = (hours-2);
			remaining*=30;
			ans = firstTwo + remaining;
			System.out.println("Total Parking fee is : Rs "+ans);
		}
	}
}
public class ParkingFeeCalculator14
{
	public static void main(String x[])
	{
		Parking s1 = new Parking();
		s1.setValue();
		s1.calculateFee();
	}
}