import java.util.Scanner;

class Q36FactorialOfEachElement
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size = sc.nextInt();
		System.out.println("Enter the Values : ");
		int a[] = new int[size];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < a.length ; i++)
		{
			int fact = 1;
			
			for(int j = 1; j <= a[i] ; j++)
			{
				fact *= j;
			}
			a[i] = fact;
		}			
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}