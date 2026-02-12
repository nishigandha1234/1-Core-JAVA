import java.util.Scanner;

public class PrimeFactorsNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		for(int i = 2 ; i<= num ; i++)
		{
			while(num%i==0)
			{
				System.out.print(i+" ");
				num/=i;
			}
		}
	}
}