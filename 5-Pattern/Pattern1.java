import java.util.Scanner;

public class Pattern1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.p
		System.out.println("Enter the Number : ");
		int n =sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++)
		{
			for(int j = 1 ; j <= n ; j++)
			{
				System.out.print("* ");
				/*				if(j == 1 || i == 5 || j == 5 || i == 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				*/
			}
			System.out.println();
		}
	}
}