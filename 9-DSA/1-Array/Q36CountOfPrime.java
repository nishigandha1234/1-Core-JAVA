import java.util.Scanner;

class Q36CountOfPrime
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements in Array : ");
		int a[] = new int[size];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		int count = 0 , countPrime= 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			count = 0;
			for(int j = 1 ; j <= a[i] ; j++)
			{
				if(a[i] % j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				countPrime++;
			}
		}
		System.out.println("Count of prime numbers : "+countPrime);
	}
}