import java.util.Scanner;

class EvenOddArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values is Array : ");
		int ar[] = new int[6];
		for(int i = 0 ; i < ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
		int even = 0, odd = 0;
		for(int i = 0 ; i < ar.length ; i++)
		{
			if(ar[i] % 2 == 0 )
			{
				even += ar[i];
			}
			else
			{
				odd += ar[i];
			}
		}	
		System.out.println("Even : "+ even);
		System.out.println("Odd : "+ odd);
	}
}