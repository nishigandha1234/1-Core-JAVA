//1 3 7 15 31 63

import java.util.*;

class Series61
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		int num = 1;
		int diff = 2;
		for(int i = 1 ; i <= 9 ;i++)
		{
			System.out.print(num+" "); //1
			num += diff; //3+4
			diff*=2; //diff=4 
		}
	}
	
}