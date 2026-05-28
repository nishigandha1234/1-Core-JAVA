/*Question 16: Write a Java program to implement Number Operation using Method Overloading.
Create a class NumberOperation and overload method calculate():
- calculate(int a, int b) => Find addition of two numbers
- calculate(int a, int b, int c) => Find the largest among three numbers
Input: Enter two numbers : 10 20 Enter three numbers : 12 45 30
Output: Addition : 30 Largest Number : 45*/

import java.util.Scanner;
class NumberOperation
{
	void calculate(int a, int b)
	{
		System.out.println("Addition of Two Numbers : " + (a+b));
	}
	void calculate(int a, int b, int c)
	{
		System.out.println("Addition of Three Numbers : " + (a+b+c));		
	}
}
public class NumberOperation15
{
	public static void main(String x[])
	{
		NumberOperation s1 = new NumberOperation();
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0 ,c = 0;
		System.out.println("Enter Value a : ");
		a = sc.nextInt();
		System.out.println("Enter Value b : ");
		b = sc.nextInt();
		System.out.println("Enter Value c : ");
		c = sc.nextInt();
		s1.calculate(a,b);
		s1.calculate(a,b,c);
	}
}