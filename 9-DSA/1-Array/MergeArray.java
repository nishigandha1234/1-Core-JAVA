import java.util.Scanner;

class MergeArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in a : ");
		int a[] = new int[5];
		System.out.println("Enter the Values in b : ");
		int b[] = new int[5];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < b.length ; i++)
		{
			b[i] = sc.nextInt();
		}
	}
}