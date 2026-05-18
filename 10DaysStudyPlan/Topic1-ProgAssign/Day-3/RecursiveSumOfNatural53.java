/*53.Recursive sum of natural numbers */

import java.util.Scanner;
class RecursiveSumOfNatural53
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num : ");
		int n = sc.nextInt();
		System.out.print(sumofNatural(n));
	}
	public static int sumofNatural(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		return n+sumofNatural(n-1);
	}
}