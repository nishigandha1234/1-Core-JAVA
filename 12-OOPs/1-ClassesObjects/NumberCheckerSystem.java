/*Question 2: Write a Java program to implement a Number Checker.
Create a class NumberCheck with a variable number.
Check whether the number is Even or Odd using a class object.
Input: Enter Number : 45
Output: Number : 45 Result : Odd Number*/

import java.util.Scanner;

class NumberCheck{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	private int num = sc.nextInt();
	
	void numberchecker()
	{
		if(num % 2 == 0)
			System.out.println("Even Number");
		else 
			System.out.println("Odd Number");
	}
}
public class NumberCheckerSystem
{
	public static void main(String x[])
	{
		NumberCheck n1 = new NumberCheck();
		n1.numberchecker();
	}
}
