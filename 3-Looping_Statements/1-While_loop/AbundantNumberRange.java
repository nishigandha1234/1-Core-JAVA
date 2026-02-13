import java.util.Scanner;

class AbundantNumberRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i<=n ; i++)
		{
			int num = i;
			for(int j = 2 ; j < num ; j++)
			{
				if(num%j==0)
				{
					sum+=j;
				}
			}
			if(sum > num) System.out.print(num+ " "); 
		}
	}
}