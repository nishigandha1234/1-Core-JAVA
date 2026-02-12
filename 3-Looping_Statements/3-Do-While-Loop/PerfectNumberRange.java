import java.util.Scanner;

class PerfectNumberRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		
		int num = 1;
		do
		{
			int sum = 0;
		
			int i = 1;
			do
			{
				if(num%i==0)
				{
					sum+=i;
				}
				i++;
			}while(i < num);
			if(sum==num && num != 0)
			{
				System.out.print(num+" ");
			}
			num++;
		}while(num<=n);
	}
}