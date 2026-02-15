import java.util.Scanner;

class PerfectNumberRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		
		int num = 1;
		while(num<=n)
		{
			int sum = 0;
		
			int i = 1;
			while(i < num)
			{
				if(num%i==0)
				{
					sum+=i;
				}
				i++;
			}
			if(sum==num && num != 0)
			{
				System.out.print(num+" ");
			}
			num++;
		}
	}
}