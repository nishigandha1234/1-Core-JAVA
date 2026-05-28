/*Question 20: Write a Java program to implement a Power Calculator using Method Overloading.
Create a class Power and overload method calculate():
- calculate(int n) => Find square of n
- calculate(int n, int p) => Find n raised to power p
Input: Enter number : 6 Enter number and power : 2 5
Output: Square : 36 Power Result : 32*/

import java.util.Scanner;
class Power
{
	void calculate(int n) 
	{
		System.out.println("Square : " + (n*n));
	}
	void calculate(int n, int p)
	{
		int ans = 1;
		for(int i = 1 ; i <= p ; i++)
		{
			ans *= n;
		}
		System.out.println("Power Result : " + ans);
	}
}
public class PowerCalculator20
{
	public static void main(String x[])
	{
		Power s1 = new Power();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		System.out.println("Enter Number & Power: ");
		int num = sc.nextInt();
		int p = sc.nextInt();
	
		s1.calculate(n);
		s1.calculate(num, p);
	}
}