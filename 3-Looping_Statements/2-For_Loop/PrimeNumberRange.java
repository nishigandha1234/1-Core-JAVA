import java.util.Scanner;

class PrimeNumberRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int num = 2 ;
		
		int i = 1;
		while(i < n)
		{
			int j = 2;
			while(j < num)
			{
				if(num%j == 0)
					break;
				j++;
			}
			if(j==num)
			{
				System.out.print( 
				System.out.print(num+" ");
			}
			i++;
			num++;
		}
	}
}