import java.util.Scanner;

class Q30ElementsDivisibleByThree
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array : ");
		int a[] = new int[6];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] % 3 == 0)
			{
				a[i] = -1;
			}
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}