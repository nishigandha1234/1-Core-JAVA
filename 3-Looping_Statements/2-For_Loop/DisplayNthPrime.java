import java.util.Scanner;

class DisplayNthPrime
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int num = 2;
		
		int i = 0;
		while(i < n)
		{
			int j;
			for(j = 2 ; j < num ; j++)
			{
				if(num%j == 0)
					break;
			}
			if(j == num) 
			{
				System.out.print(num+" ");
				i++;
			}
			num++;
		}
	}
}