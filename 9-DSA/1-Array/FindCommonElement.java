import java.util.Scanner;

class FindCommonElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in first Array : ");
		int[] a = new int[5];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the Values in Second Array : ");
		int[] b = new int[6];
		for(int i = 0 ; i < b.length ; i++)
		{
			b[i] = sc.nextInt();
		}
		System.out.print("Common Elements are : ");
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < b.length ; j++)
			{
				if(a[i] == b[j])
				{
					c[i] = b[j] ;
				}
			}
		}
	}
}