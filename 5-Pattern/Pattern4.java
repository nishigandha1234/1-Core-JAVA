import java.util.Scanner;

public class Pattern4
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++)
		{
			for(int j = 1 ; j <= n ; j++)
			{
				if(j ==1 || j <= i )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}