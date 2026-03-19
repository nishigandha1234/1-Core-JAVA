import java.util.Scanner;

class Q38MissingSmallestElement
{
	public static void main(String x[])
	{
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[5];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}*/
		int a[] = {1,3,5,7};
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			int diff = a[i+1] - a[i];
			
			if(diff > 1)
			{
				for(int j = 1 ; j < diff ; j++)
				{
					System.out.print(a[i] + j+ ",");
				}
			}
		}
	}
}