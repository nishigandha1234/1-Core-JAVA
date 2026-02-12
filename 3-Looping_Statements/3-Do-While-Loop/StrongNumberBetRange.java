import java.util.Scanner;

class StrongNumberBetRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
	
		int i = 1;
		do
		{
			int temp = i;
			int sum = 0;
			do
			{
				int rem = temp%10;
				int fact =1 ;
				for(int j =1 ; j<= rem ; j++)
					fact*=j;
				sum+=fact;
				temp/=10;
			}
			while(temp !=0);
			if(sum == i)
				System.out.println(i+" ");
			i++;
		}
		while(i<=n);
	}
}