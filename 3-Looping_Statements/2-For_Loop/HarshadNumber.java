import java.util.Scanner;

class HarshadNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		
		for(int i =1 ; i<= n; i++)
		{
			int num = i;
			int sum = 0;
			while(num != 0)
			{
				int rem = num%10;
				sum += rem;
				num/=10;
				
			}
			if(i%sum==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
