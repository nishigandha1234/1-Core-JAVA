//majority element means count > n/2 times

import java.util.Scanner;

class MajorityElementArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size in Array : ");
		int size = sc.nextInt();
		int[] ar = new int[size];
		int n = ar.length;
		int count = 1; 
		System.out.println("Enter the Elements in Array : ");
		for(int i = 0 ; i < ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
		int i;
		for(i = 0 ; i < ar.length-1 ; i++)
		{
			for(int j = i+1 ; j < ar.length ; j++)
			{
				if(ar[i] == ar[j])
				{
					count++;
				}
			}
		}
		if(count > n/2)
		{
			System.out.println("Majority Element is : "+ar[i]);
		}
		else
		{
			System.out.println("NO Majority Element");
		}
	}
}