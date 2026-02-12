import java.util.Scanner;

public class PrimeNumberRange
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int i=1;
		int num = 2;
		do
		{
			int j = 2;
			do
			{
				if(num%j==0) break;
				j++;
			}
			while(j<num);
			
			if(j==num) 
				System.out.print(num+" ");
			i++;
			num++;
		}while(i<n);
	}
}