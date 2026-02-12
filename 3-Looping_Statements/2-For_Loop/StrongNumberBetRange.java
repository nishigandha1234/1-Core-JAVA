import java.util.Scanner;

class StrongNumberBetRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
	
		for(int i = 1;i<=n;i++)
		{
			int temp = i;
			int sum = 0;
			while(temp !=0)
			{
				int rem = temp%10;
				int fact =1 ;
				for(int j =1 ; j<= rem ; j++)
					fact*=j;
				
				sum+=fact;
				temp/=10;
			}
			if(sum == i)
				System.out.println(i+" ");
		}
	}
}