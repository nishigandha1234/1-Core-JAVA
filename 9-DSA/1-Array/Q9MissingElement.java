import java.util.Scanner;

class Q9MissingElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in an Array : ");
		int a[] = new int[5];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}			
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			for(int j = a[i]+1 ; j < a[i+1] ; j++)
			{
				System.out.print(j + " ");
			}
		}
	}
}