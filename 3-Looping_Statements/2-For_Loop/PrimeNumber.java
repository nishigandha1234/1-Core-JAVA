import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value : " );
		int n = sc.nextInt();
		boolean isPrime = true;
		
		if(n <= 1)
		{
			System.out.println("Not prime");
			return;
		}
		
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)	System.out.println("Prime");
		else System.out.println("Not Prime");
	}
}