//1 -2 3 -4 5 -6 7 -8

import java.util.*;
class Series66
{
	public static void main(String x[])
	{
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Range : ");
	int n = sc.nextInt();
	int num = 1;
	for(int i = 1; i<= n ; i++)
	{
		System.out.print(num+" "+(-(i*2))+" ");
		num+=2;
	}
	}
}