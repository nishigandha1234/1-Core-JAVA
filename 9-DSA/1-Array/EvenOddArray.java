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
        System.out.print("\nEven Numbers are : ");
		for(int i = 0 ; i < ar.length ; i++)
		{
			if(ar[i] % 2 == 0 )
			{
				System.out.print(ar[i]+" ");
			}
		}
		System.out.print("\nOdd Numbers are : ");
		for(int i = 0 ; i < ar.length ; i++)
		{
			if(ar[i] % 2 != 0 )
			{
				System.out.print(ar[i]+" ");
			}
		}		
		
	}
}