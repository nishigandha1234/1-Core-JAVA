import java.util.Scanner;

class ReverseArrayInSame
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[5];
		int k = a.length-1;
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			int temp = a[i];
			int j;
			for(j = 0 ; j < a.length-1-i ; j++)
			{
				a[j] = a[j+1];
			}
			a[j] = temp;
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}