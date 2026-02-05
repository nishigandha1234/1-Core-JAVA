import java.util.Scanner;

public class FindTargetSum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		System.out.print("Enter the Target Element : ");
		int target = sc.nextInt();
		System.out.println("Enter the Values in Array : ");
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0; i< a.length ; i++)
		{
			for(int j =(i+1); j < a.length ; j++)
			{
				if(a[i] + a[j] == target)
				{	
					System.out.println("a["+a[i]+"]" +", a["+a[j]+"]");
				}
				else
				{	
					System.out.println("a["+a[i]+"]" +", a["+a[j]+"]");
				}	
			}
		}
	}
}