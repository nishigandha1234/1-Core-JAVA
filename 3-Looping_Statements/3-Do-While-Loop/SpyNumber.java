import java.util.Scanner;

class SpyNumber
{
	public static void main(String x[])
	{
		int sum = 0 , prod = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		do
		{
			int rem = num%10;
			sum += rem;
			prod *= rem;
			num/=10;
		}while(num != 0);
		
		if(sum==prod) System.out.println(" Spy Number");
		else System.out.println(" NOT Spy Number");
	}
}