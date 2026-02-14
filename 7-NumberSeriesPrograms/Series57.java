// 1 1 2 3 5 8 13 21 34
//(Fibonacci series using loop—first 9 terms)

import java.util.Scanner;

class Series57
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		int num = 1;
		int a = 1;
		for(int i =1 ; i <= n ; i++)
		{
			System.out.print(num+" ");
			int sum = num+a;
			num = a;
			a = sum;
		}
	}
}