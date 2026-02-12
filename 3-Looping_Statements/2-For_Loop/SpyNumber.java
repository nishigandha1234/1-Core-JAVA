import java.util.Scanner;

class SpyNumber
{
	public static void main(String x[])
	{
		int sum = 0 , prod = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		for( ;num != 0; num/=10)
		{
			int rem = num%10;
			sum += rem;
			prod *= rem;
		}
		
		if(sum==prod) System.out.println(" Spy Number");
		else System.out.println(" NOT Spy Number");
	}
}