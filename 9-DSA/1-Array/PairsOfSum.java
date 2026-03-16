import java.util.Scanner;

class PairsOfSum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements in Array : ");
		int ar[] = new int[5];
		for(int i = 0 ; i < ar.length ; i++)
		{
			ar[i] =sc.nextInt();
		}
		System.out.println("Enter the Target Element : ");
		int target = sc.nextInt(); //6
		int count = 0 ;
		for(int i = 0 ; i < ar.length-1 ; i++)
		{
			for(int j = i+1 ; j < ar.length ; j++)
			{
				if(ar[i] + ar[j] == target)
				{
					count++;
				}
			}
		}
		if(count > 0)
		{
			System.out.println("Total pairs = "+count);
		}
		
	}
}