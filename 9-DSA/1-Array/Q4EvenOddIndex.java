import java.util.Scanner;

class Q4EvenOddIndex
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size in Array : ");
		int size = sc.nextInt();
		System.out.println("Enter the Values in Array : ");
		int ar[] = new int[size];
		
		for(int i = 0 ; i< ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.print(" Values at Even Index : ");
		for(int i = 0 ; i < ar.length ; i++)
		{
			if(ar[i] % 2 == 0)
				System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.print(" Values at Even Index : ");
		for(int i = 0 ; i < ar.length ; i++)
		{
			if(ar[i] % 2 != 0)
				System.out.print(ar[i] + " ");
		}
	}
}