import java.util.*;

public class PrimeNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		boolean isPrime = true;
		int i = 2;
		
		if(num <= 1)
		{
			System.out.println("NOT Prime Number");
			return;
		}
		
		while(i < num)
		{
			if(num % i == 0)
			{
				isPrime = false;
				break;
			}
			i++;
		}
		
		if(isPrime) System.out.println("Prime Number");
		else System.out.println("Not Prime Number");
	}
}