import java.util.Scanner;

public class PerfectNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :" );
		int num = sc.nextInt();
		int sum= 0;
		
		for(int i = 1 ; i < num; i++)
		{
			if(num % i == 0)
			{
				sum += i;
			}
		}
		if(sum == num) System.out.println("Perfect Number");
		else System.out.println("Not Perfect Number");
	}
}
		