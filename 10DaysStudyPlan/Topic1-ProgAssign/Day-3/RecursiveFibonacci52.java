/*52 Recursive Fibonacci  */

import java.util.Scanner;
class RecursiveFibonacci52
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range : ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++)
		{
			System.out.print(fibo(i)+" ");
		}
	}
	public static int fibo(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
}