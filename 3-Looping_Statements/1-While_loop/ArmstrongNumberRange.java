import java.util.Scanner;

public class ArmstrongNumberRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		for(int j = 1; j <= n ; j++)
		{
			int num = j;
			int count = 0;
			for(int temp = num ; temp !=0 ; temp/=10)
			{
				count++;
			}
			int sum = 0;
			
			for(int temp = num; temp != 0 ; temp/=10)
			{	
				int rem = temp%10;
				int pow = 1;
				for(int i = 1 ; i <= count; i++)
				{
					pow*=rem;
				}
				sum+=pow;
			}
			if(sum == num) System.out.println(num);
		}
	}
}