//2 6 12 20 30 42 56 72 90 110
//(n(n+1) pattern multiplied by 2)*

import java.util.*;
class Series58
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		int n = 1;
		for(int i = 1 ; i <= n ; i++)
		{
			System.out.print( (n*(n+1)) +" "); //2
			n++; 
		}
	}
}