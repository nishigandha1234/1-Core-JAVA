import java.util.Scanner;

class Q38MissingSmallestElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[5];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			int diff = a[i+1] - a[i];
			for(int j = 1 ; j < diff ; j++)
			{
				if(diff > 1 )
				{
					System.out.println(a[i] + j);
				}
			}
		}
	}
}