//2 5 10 17 26 37 ?
// 3  5  7  9

import java.util.*;

class Series64
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		
		int num = 2;
		int diff = 3;
		for(int i =1 ; i<= n ; i++)
		{
			System.out.print(num+" ");
			num+=diff;
			diff+=2;
		}
	}
}