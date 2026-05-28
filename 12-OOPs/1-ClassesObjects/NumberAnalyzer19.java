/*Question 19: Write a Java program to implement a Number Analyzer using Method Overloading.Create a class NumberAnalyzer and overload method check():
- check(int num) => Check even or odd
- check(int num1, int num2) => Find the greater number
- check(int num1, int num2, int num3) => Find the smallest number
Input: Enter number : 14 Enter two numbers : 20 15 Enter three numbers : 9 4 7
Output: 14 is Even Greater Number : 20 Smallest Number : 4*/

import java.util.Scanner;
class NumberAnalyzer
{
	void check(int num)
	{
		System.out.println(num%2==0 ? num+" : is Even Number" : num+" : is Odd Number" );
	}
	void check(int num1, int num2)
	{
		System.out.println( (num1 > num2) ? num1+" : is Greater Number" : num2+" : is Greater Number");
	}
	void check(int num1, int num2, int num3)
	{
		if(num1 < num2 && num1 < num3)
			System.out.println(num1 + " : is Smallest Number");
		else if(num2 < num1 && num2 < num3)
			System.out.println(num2 + " : is Smallest Number");
		else 
			System.out.println(num3 + " : is Smallest Number");
	}
}
public class NumberAnalyzer19
{
	public static void main(String x[])
	{
		NumberAnalyzer s1 = new NumberAnalyzer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		System.out.println("Enter Two Numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter Three Numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
	
		s1.check(num);
		s1.check(num1, num2);
		s1.check(n1, n2, n3);
	}
}