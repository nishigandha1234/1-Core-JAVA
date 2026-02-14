import java.util.Scanner;

class AbundantNumberRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		for(int j=1;j<n;j++)
		{
			int num = j;
			int sum = 0;
	
			for(int i = 1 ; i < num ; i++)
			{
				if(num%i==0)
				{
					sum+=i;
				}
			}
			System.out.print((sum>num) ? " "+num:""); 
		}
	}
}