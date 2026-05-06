import java.util.Scanner;
class Pattern41New
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows : ");
		int rows = sc.nextInt();
		int n = 1;
		
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j =1 ; j <= rows ; j++)
			{
				if(j <= n)
				{
					System.out.print(n+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			n = (i < (rows+1)/2) ? n+2 : n-2;
		}
	}
}