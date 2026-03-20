import java.util.Scanner;
import java.util.Scanne
class FindMaxSumSubArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int[] ar = new int[9];
		for(int i = 0 ; i < ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < ar.length ;i++)
		{
			int sum = 0 ;
			for(int j = i ; j < ar.length ; j++)
			{
				sum+= ar[j];
				if(sum > max)
				{
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
}
