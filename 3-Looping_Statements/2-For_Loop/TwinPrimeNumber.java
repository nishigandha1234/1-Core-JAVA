import java.util.Scanner;

class TwinPrimeNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter n2 : ");
		int n2 = sc.nextInt();
		boolean isPrime1 = true;
		boolean isPrime2 = true;
		
		if(n1<=1) isPrime1 = false;
		if(n2<=1) isPrime2 = false;
		
		for(int i =2 ; i<= n1/2 ; i++)
		{
			if(n1%i==0)
			{
				isPrime1 = false;
				break;
			}
		}
		for(int i =2 ; i<= n2/2 ; i++)
		{
			if(n2%i==0)
			{
				isPrime2 = false;
				break;
			}
		}
		
		if(isPrime1 && isPrime2 && (n2-n1 == 2))
			System.out.println(n1+","+n2+" are Twin Primes");
		else
			System.out.println(" Not Twin Primes");
	}
}