import java.util.Scanner;

class PrimeFactors
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		int i = 2;
		while(i<=num)
		{
			while(num%i == 0)
			{
				System.out.println(i);
				num/=i;
			}
			i++;
		}
		
	}
}